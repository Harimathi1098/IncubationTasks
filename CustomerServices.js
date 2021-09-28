import React,{useState,useEffect} from 'react';
import { useHistory } from 'react-router';
import Header from './Header';
import './App.css';
function CustomerServices()
{
  
  localStorage.getItem("user-info");
  const[customerSummary,setCustomerSummary]=useState([])
  const result=localStorage.getItem("user-info")
  
  //console.log(result)
  let wow=JSON.parse(result);
   console.log(wow.customername)
  useEffect(
    ()=>
    {
      fetch(`http://localhost:8080/zulacabs/zulacabs/zulaapi/customer/${wow.customername}/ridedetailssummary`)
      .then(resp=>(resp.json()))
      .then(resp=>
        {console.log(resp)
          setCustomerSummary(resp)
        })
      .catch(e=>console.log(e))
    }
  ,[]);
      
             return(
    <div>
        <Header />
   <h1>Customer Rides Summary</h1>
   <p>
     Customer_id:  {wow.customerid}
     <br />
     Customer_Name:  {wow.customername}
     </p>
  
   
   <table id="customers">
     <thead>
     <th>Driver id</th>
     <th>Source</th>
      <th>Destination</th>
      <th>Total Fare</th>
       
      

     </thead>
     <tbody>
       {
         customerSummary.map((c,index)=>
         {
                return<Tr key={index} customerSummary={c}/>
         }
         )
       }
     </tbody>
     </table>
    
    </div>
    );
}
const Tr=({customerSummary})=>
{
return(
  <tr>
    <td>{customerSummary.Driverid}</td>
    <td>{customerSummary.source}</td>
    <td>{customerSummary.destination}</td>    
    <td>{customerSummary.totalfare}</td>
    


  </tr>
)
}
export default CustomerServices