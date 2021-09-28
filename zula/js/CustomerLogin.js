import React,{useState,useEffect} from 'react'
import { useHistory } from 'react-router'
import Header from "./Header"
 function CustomerLogin() {
   const[customername,setCustomerName]=useState("");
   const[customerpassword,setCustomerPassword]=useState("");
   const history=useHistory();
   async function login()
{
   console.warn(customername,customerpassword)
   let item=[customername,customerpassword];
   let a='{"customername":"xx","customerpassword":"66"}';
   JSON.stringify(item)
   let result=await fetch("http://localhost:8080/zulacabs/zulacabs/zulaapi/customer/login",{
     
        method:'POST',
     headers:
      {
         "Content-Type":"application/json",
         "Accept":"application/json"
      },
      body:JSON.stringify(item)
      });
      console.log(result);
      result= await result.json();
      localStorage.setItem("user-info",JSON.stringify(result))
      history.push('/CustomerSummary')

   }
   


   return (
      <div>
          <Header />
         <h2>ZULA CABS</h2>
         <h1>CUSTOMER LOGIN</h1>

         <input type="text" id="fname" name="name" placeholder="Username" onChange={(e)=>setCustomerName(e.target.value)}/>

         <br />
         <input type="password" id="pass" name="password" placeholder="Password" onChange={(e)=>setCustomerPassword(e.target.value)}/>
         <br />
         <input type="button" onClick={login}   value="Login" />
      </div>
   )
}

export default CustomerLogin