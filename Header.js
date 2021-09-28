import { useHistory } from "react-router"

function Header()
{
    const history=useHistory();
    function logout()
    {
       localStorage.clear();
       history.push("/Home")
    }
    return (
        <div name="header">
        <ul>
              {
                (!(localStorage.getItem("driver-info")&&localStorage.getItem("user-info")))?
                <>
              
              <li><a href="Home">Home</a></li>
              </>
                :
                <>
                
                </>
              }
            
            {
                (!(localStorage.getItem("driver-info")||localStorage.getItem("user-info")))?
                <>
              
                <li style={{float:"right"}}><a href="CustomerLogin">Customer</a></li>
                <li style={{float:"right"}} ><a href="DriverLogin">Driver</a></li>
                <li style={{float:"right"}}><a href="AdminLogin">Admin</a></li>                   
                </>
                :
                <>
                
                </>
                 
            }
               {
        localStorage.getItem("driver-info")?
        <>
        <li><a href="DriverServices">DriverServices</a></li>
        
        </>
        :
        <>
            
        </>
               }
             
        {
        localStorage.getItem("user-info")?
        <>
        
        <li><a href="CustomerServices">CustomerServices</a></li>
        <li><a href="BookTaxi">BookTaxi</a></li>
        </>
        :
        <>
             
        </>
        }
           { localStorage.getItem("user-info")?
        <>
        <li onClick={logout} style={{float:"right"}} ><a href="Home">Logout </a></li>
        </>
        :
        null
                  }
           { localStorage.getItem("driver-info")?
        <>
        <li onClick={logout} style={{float:"right"}} ><a href="Home">Logout </a></li>
        </>
        :
        null
            }
        </ul>
        </div>
    )
}
export default Header