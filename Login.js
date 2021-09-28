import React,{useState,useEffect} from 'react'
import { useHistory } from 'react-router'
import Header from './Header';
 function Login() {
   const[customername,setCustomerName]=useState("");
   const[customerpassword,setCustomerPassword]=useState("");
   const[error,seterror]=useState(null)
   const history=useHistory();
  
   async function clogin()   
   {
    
   //console.warn(customername,customerpassword)
   let item={customername,customerpassword};
   let a='{"customername":"xx","customerpassword":"66"}';
   let content=JSON.stringify(item)
   //console.warn(re)
   let result=await fetch("http://localhost:8080/zulacabs/zulacabs/zulaapi/customer/login",{
        
        method:'POST',
     headers:
      {
         "Content-Type":"application/json",
         "Accept":"application/json"
      },
      body:content
      });
      console.log("mainresult  "+result)
      result=await result.json();
      console.log("result after .json  "+result)
         if(result.error===3)
         {
            var wow=JSON.stringify(result)
            console.log("result after stringify "+wow)
            var cat=JSON.parse(wow)
            console.log("result after parse "+cat.customername)
         localStorage.setItem("user-info",JSON.stringify(result))      
         history.push('/BookTaxi')
         //console.log(result)
      }
         else if(result.error===4)
         {
            history.push("/CustomerLogin")
            seterror(result.message)
            //console.log(result.message)

         }
         else if(result.error===2)
         {
            seterror(result.message)
            //console.log(result.message)
         }
         else if(result.error===1)
         {
            seterror(result.message)
            //console.log(result.message)
         }
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
         {error && <div className="error">{error}</div>}
         <input type="button" onClick={clogin}   value="Login" />

         {/*<div className="error">Login with valid Username and Password</div>*/}
      </div>
   )

   }
export default Login