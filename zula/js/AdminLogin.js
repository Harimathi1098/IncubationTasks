import React,{useState,useEffect} from 'react'
import { useHistory } from 'react-router'
import Header from "./Header"
function AdminLogin() {
   const[adminname,setAdminName]=useState("");
   const[adminpassword,setAdminPassword]=useState("");
   const[error,setError]=useState(null)
   const history=useHistory();
  let item={adminname,adminpassword}
  let result=JSON.stringify(item)
   function login()   
   {
    if(adminpassword==="Secret"&&adminname==="admin")
    {
       localStorage.setItem("admin-info",result)
       history.push("/AdminServices")
    }
    else{
       setError("Enter valid username and password")
    }
   }
      
   return (
      <div>
         <Header />
         <h2>ZULA CABS</h2>
         <h1>ADMIN LOGIN</h1>

         <input type="text" id="fname" name="firstname" placeholder="Username"  onChange={(e)=>setAdminName(e.target.value)}/>

         <br />
         <input type="password" id="pass" name="password" placeholder="Password" onChange={(e)=>setAdminPassword(e.target.value)}/>
         <br />
         {error && <div className="error">{error}</div>}
         <input type="button" value="Login" onClick={login}/>
      </div>
   )
}

export default AdminLogin