import React,{useState,useEffect} from 'react'
import { useHistory } from 'react-router'
import Header from "./Header"

function AdminServices()
{
const history=useHistory();
  const[adminSummary,setAdminSummary]=useState([])
  const[driver,setDriver]=useState([])
  const[fare,setFare]=useState(0.0)
  const[i,seti]=useState(1)
  useEffect(
      ()=>
      {
        fetch("http://localhost:8080/zulacabs/zulacabs/zulaapi/admin/driver")
        .then(resp=>(resp.json()))
        .then(resp=>
          {console.log(resp)
            setDriver(resp)
          })
        .catch(e=>console.log(e))
      }
    ,[]);

   useEffect( ()=>
    {
        console.log("working")
      fetch("http://localhost:8080/zulacabs/zulacabs/zulaapi/admin/summary")
      .then(resp=>(resp.json()))
      .then(resp=>
        {console.log(resp)
          setAdminSummary(resp)
        })
      .catch(e=>console.log(e))
    }
  ,[]);
  function proceed()
  {
      console.log(driver.length)
      if(i<driver.length)
      {
             seti(i);
      }
      else
      {
     
     seti(1)
      }
    }
   /* function goBack()
    {
       
        
    }*/

  
  

return(
    <div>
        <Header />
        <h1>ALL DRIVER RIDES SUMMARY</h1>         
     
   
     
        
     {driver.map((driver)=>
     {
         if(driver.ID==i)
         {
             return <p>Driver Id:&nbsp;&nbsp;{i}
                 <br/>
                 Driver Name:&nbsp;&nbsp;{driver.name}
                 <br/>
                 Total Earnings:Rs.&nbsp;{driver.totalfare}.00
                 <br/>
                 Zula Commission:Rs.&nbsp;{driver.zulacommission}.00
                         
             
             </p>
             
         }
     }
     )}  
     
        
        <table id="customers">
     <thead>
     <th>Driver id</th>
     <th>Customer id</th>
     <th>Source</th>
      <th>Destination</th>
      <th>Total Fare</th>
    
      <th>Zula Commission</th>
      <th>Pickup Time</th>
       
      

     </thead>
     <tbody>
        {
              adminSummary.map((admin)=>{
                  
                if(admin.driverid==i)
                  {
                return<Tr  adminSummary={admin}/>
                  }
                  
              })
        }
        </tbody>
     </table>
     <input id="button" type="button" value="Previous" /*onClick={/*goBack}*/ />
     <input id="button" type="button" value="Next" onClick={proceed} />
    
    
<br />
<br />
        
    </div>
         )
}
const Tr=({adminSummary})=>
{
    
return(
  <tr>
    <td>{adminSummary.driverid}</td>
    <td>{adminSummary.customerid}</td>
    <td>{adminSummary.source}</td>
    <td>{adminSummary.destination}</td>    
    <td>{adminSummary.fare}</td>    
    <td>{adminSummary.zulacommission}</td>
    <td>{adminSummary.time}</td>
    
   

  </tr>
    
)
    }

export default AdminServices