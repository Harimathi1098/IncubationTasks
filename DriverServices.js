import React,{useState,useEffect} from 'react';
import { useHistory } from 'react-router';
import Header from './Header';
import './App.css';
function DriverServices()
{
  
   const[driverSummary,setDriverSummary]=useState([])
  const result=localStorage.getItem("driver-info")
  
  //console.log(result)
  let wow=JSON.parse(result);
   console.log(wow.drivername)
  useEffect(
    ()=>
    {
      fetch(`http://localhost:8080/zulacabs/zulacabs/zulaapi/driver/${wow.drivername}/ridedetailssummary`)
      .then(resp=>(resp.json()))
      .then(resp=>
        {console.log(resp)
          setDriverSummary(resp)
        })
      .catch(e=>console.log(e))
    }
  ,[]);
      
             return(
    <div>
        <Header />
   <h1>Driver Rides Summary</h1>
   <p>
     Driver_id:  {wow.driverid}
     <br />
     Driver_Name:  {wow.drivername}
     </p>
  
   
   <table id="customers">
     <thead>
     <th>Customer id</th>
     <th>Source</th>
      <th>Destination</th>
      <th>Total Fare</th>
      <th>Zula Commisssion</th>
       
      

     </thead>
     <tbody>
       {
         driverSummary.map((d,index)=>
         {
                return<Tr key={index} driverSummary={d}/>
         }
         )
       }
     </tbody>
     </table>
    
    </div>
    );
}
const Tr=({driverSummary})=>
{
return(
  <tr>
    <td>{driverSummary.Customerid}</td>
    <td>{driverSummary.source}</td>
    <td>{driverSummary.destination}</td>    
    <td>{driverSummary.totalfare}</td>    
    <td>{driverSummary.zulacommission}</td>

  </tr>
)
}
export default DriverServices