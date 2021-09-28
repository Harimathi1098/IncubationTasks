import React,{useState,useEffect} from 'react';
import { useHistory } from 'react-router';
import Header from './Header';
import './App.css';


function BookTaxi()
{

    const history= useHistory();
    const[location,setLocation]=useState([]);
  const[pickuppoint,setPickUpPoint]=useState("");
  const[droppoint,setDropPoint]=useState("");
  const[error,setError]=useState(null);

  useEffect(
    ()=>
    {
      fetch("http://localhost:8080/zulacabs/zulacabs/zulaapi/customer/booktaxi/location")
      .then(resp=>(resp.json()))
      .then(resp=>
        {console.log(resp)
          setLocation(resp)
        })
      .catch(e=>console.log(e))
    }
  ,[]);
  function isValid()
  {
      if((pickuppoint>='A'&&pickuppoint<='H')&&(droppoint>='A'&&droppoint<='H'))
      {
          history.push('/RideDetails');
          localStorage.setItem("pickup",pickuppoint);
          localStorage.setItem("drop",droppoint);
      }
      else if(!(pickuppoint>='A'&&pickuppoint<='H'))
      {
            setError("Enter a valid pickup point")
      }
      else if(!(droppoint>='A'&&droppoint<='H'))
      {
            setError("Enter a valid drop point")
      }
      else if((!pickuppoint>='A'&&pickuppoint<='H')&&(droppoint>='A'&&droppoint<='H'))
      {
        setError("Enter a valid pickup and drop point")
    }
      }

  
      
             return(
    <div>
        <Header />
   <h1 className="cust">Taxi Location Details</h1>
   
      
   
   <table id="customers">
     <thead>
     <th>Driver id</th>
     <th>Location</th>
         
      

     </thead>
     <tbody>
       {
         location.map((l,index)=>
         {
                return<Tr key={index} location={l}/>
         }
         )
       }
     </tbody>
     </table>
    <h1 className="cust"> TAXI BOOKING</h1>
    <input type="text" id="source" name="name" placeholder="Enter Source" onChange={(e)=>setPickUpPoint(e.target.value)} />

         <br />
         <input type="text" id="destination" name="password" placeholder="Enter Destination" onChange={(e)=>setDropPoint(e.target.value)} />
         <br />
         {error && <div className="error">{error}</div>}
         <input type="button" onClick={isValid}  value="Continue" />

    </div>
    );
}
const Tr=({location})=>
{
return(
  <tr>
    <td>{location.driverid}</td>
    <td>{location.location}</td>
    
    


  </tr>
)
}
export default BookTaxi