import Header from "./Header";
import './App.css';
import React,{useState,useEffect} from 'react';
import { useHistory } from 'react-router';
function FinalBookingDetails()
{
   
    
return(
    <div>
        <Header />
        <p color="green">REGISTRATION SUCCESSFULL !!!</p>
        <h1 >FINAL BOOKING DETAILS</h1>
        <p>
                   <table id="location" width="60%">
                       <tr>
                       <th> Customer Name:</th>
                <td>{JSON.parse(localStorage.getItem("user-info")).customername}</td>
                </tr>
                <tr>
                <th> Source:</th>
                <td> {localStorage.getItem("pickup")}</td>
                </tr>
                   
                <tr>
                <th> Destination: </th>
                <td>{localStorage.getItem("drop")}</td>
                </tr>
               
                <tr>
                <th> Total Fare: </th>
                <td> {localStorage.getItem("fare")}</td>
                </tr>
              
                <tr>
                <th> Driver ID: </th>
                <td> {localStorage.getItem("driverid")}</td>
                </tr>
                             
                 <p className="final">Thanks for choosing Zula cabs!!</p>
                 <p className="final">Have a Safe Ride!!!!</p>

</table>
</p>
    </div>
)
}
export default FinalBookingDetails