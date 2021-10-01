import { useState } from "react/cjs/react.development";
import React,{useEffect} from 'react'
import { useHistory } from 'react-router'
import Header from "./Header";
import './App.css';
function CustomerRegistration()
{
    const[customername,setCustomerName]=useState("")
    const[message,setMessage]=useState(null)
    const[customerpassword,setCustomerPassword]=useState("")
    const[age,setAge]=useState(0)
    const history=useHistory();
    
async function Register()
{
   
   let item={customername,customerpassword,age}
   let stringified= JSON.stringify(item)
   console.log(stringified)
   let result=await fetch("http://localhost:8080/zulacabs/zulacabs/zulaapi/customer/registration",{
     
        method:'POST',
     headers:
      {
         "Content-Type":"application/json",
         "Accept":"application/json"
      },
      body: stringified
      });
      console.log(result);
      result= await result.json();
      if(customername===("")&&customerpassword===("")&&age===0)
      {
          setMessage("Enter valid details")
      }
      if(customername===("")||customerpassword===("")||age<=18)
      {
          setMessage("Enter valid details")
      }
      else{
          if(result.error===1)
          {
            setMessage("Registration Successful!! Redirecting to Login page in 3 seconds.....")
            setTimeout(() => {
              history.push('/CustomerLogin');
              }, 3000);
            
          }
          else if(result.error===0)
          {
            setMessage("Username already taken. Kindly try with different name")
          }
          else if(result.error===-1)
          {
            setMessage("Something went wrong!!! Try again later!!")
          }

      }

     
     //history.push('/CustomerLogin')
   }

    return(
        <div> 
            <Header />
            <h1>Customer Registration</h1>
            <input type="text" id="name" name="name" placeholder=" Enter Username" onChange={(e)=>setCustomerName(e.target.value)} required/>

         <br />
         <input type="password" id="password" name="password" placeholder="Enter Password" onChange={(e)=>setCustomerPassword(e.target.value)} required/>
         <br />
         <input type="text" id="age" name="age" placeholder="Enter Age" onChange={(e)=>setAge(e.target.value)} required/>
         <br />
         <br />
         {message && <div className="error">{message}</div>}
         <input type="button" onClick={Register}   value="Register" />

        </div>
    )
}
export default CustomerRegistration