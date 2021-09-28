import React,{useState,useEffect} from 'react';
import { useHistory } from 'react-router';
import Header from './Header';
import './App.css';
function RideDetails()
{
    const history=useHistory();
    const[res,setRes]=useState([]);
    console.log(JSON.stringify(localStorage.getItem("pickup")))
    let pickuppoint=(localStorage.getItem("pickup"));
    let droppoint=(localStorage.getItem("drop"));
    let item={pickuppoint,droppoint};
    let result=JSON.stringify(item);
    let name=JSON.parse(localStorage.getItem("user-info")).customername
    console.log(result)
    useEffect(
        ()=>
        {
          fetch("http://localhost:8080/zulacabs/zulacabs/zulaapi/customer/booktaxi/getfare",
          {
              method:
              'POST',
              headers:
      {
         "Content-Type":"application/json",
         "Accept":"application/json"
      },
              body:
              result

          })
          .then(resp=>(resp.json()))
          .then((resp)=>
            {console.log(resp)
              setRes(resp)
            })
          .catch(e=>console.log(e))
        }
      ,[]);
      function cancelRide()
      {
          history.push("/BookTaxi")
      }
      async function proceed()
      {
        let book= await fetch(`http://localhost:8080/zulacabs/zulacabs/zulaapi/customer/booktaxi/${name}/final`,
              {
                  method:
                  'POST',
                  headers:
          {
             "Content-Type":"application/json",
             "Accept":"application/json"
          },
                  body:
                  result
    
              });
              book=await book.json();
              console.log(book);
              localStorage.setItem("fare",book.totalfare)
              localStorage.setItem("driverid",book.driveid)
         
          history.push("/FinalBookingDetails")
      }
      localStorage.setItem("fare",res.totalfare)
     
    return(
        <div>
            <Header />
            <h1>RideDetails</h1>
               
               <p>
                   <table id="location" width="60%">
                       <tr>
                       <th> Customer Name:</th>
                <td>{JSON.parse(localStorage.getItem("user-info")).customername}</td>
                </tr>
                <tr>
                <th> Source:</th>
                <td> {res.pickuppoint}</td>
                </tr>
                   
                <tr>
                <th> Destination: </th>
                <td>{res.droppoint}</td>
                </tr>
               
                <tr>
                <th> Total Fare: </th>
                <td> {"Rs."+res.totalfare}</td>
                </tr>
              
              

</table>
</p>
<input  type="button" id="cancel" name="Cancel" value="Cancel" onClick={cancelRide} />

<input type="button" id="continue" name="continue" value="Continue" onClick={proceed} />
        </div>
    );
    }
export default RideDetails;