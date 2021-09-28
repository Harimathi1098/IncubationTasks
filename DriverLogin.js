import React,{useState,useEffect} from 'react'
import { useHistory } from 'react-router'
import Header from "./Header"
function DriverLogin() {
   const[drivername,setDriverName]=useState("");
   const[driverpassword,setDriverPassword]=useState("");
   const[error,seterror]=useState(null)
   const history=useHistory();
  
   async function dlogin()   
   {
    
   //console.warn(customername,customerpassword)
   let credentials={drivername,driverpassword};
   
   let content=JSON.stringify(credentials)
   //console.warn(re)
   let result=await fetch("http://localhost:8080/zulacabs/zulacabs/zulaapi/driver/login",{
        
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
         localStorage.setItem("driver-info",JSON.stringify(result))      
         history.push('/DriverServices')
         //console.log(result)
      }
         else if(result.error===4)
         {
            history.push("/DriverLogin")
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
         <h1>DRIVER LOGIN</h1>
         <input type="text" id="fname" name="firstname" placeholder="Username" onChange={(e)=>setDriverName(e.target.value)} />

         <br />
         <input type="password" id="pass" name="password" placeholder="Password" onChange={(e)=>setDriverPassword(e.target.value)} />
         <br />
         {error && <div className="error">{error}</div>}
         <input type="button" value="Login" onClick={dlogin}/>
      </div>
   )
}

export default DriverLogin