import React from 'react';
import { useState,useEffect } from 'react';
import { useHistory } from 'react-router';
import CustomerServices from './CustomerServices';
function Protected(props)
{
   let Cmp=props.Cmp
   const history=useHistory();
   useEffect(()=>{
       if(!localStorage.getItem("user-info"))
       {
       history.push("/Home")
       }
   },[])

   return(
    <div>
        <Cmp />
    </div>
)
}

export default Protected