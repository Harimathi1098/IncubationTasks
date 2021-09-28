import logo from './logo.svg';
import './App.css';
import { BrowserRouter, Route } from 'react-router-dom';
import Header from './Header'
import AdminLogin from './AdminLogin'
import CustomerLogin from './CustomerLogin'
import DriverLogin from './DriverLogin'
import Home from './Home'
import CustomerServices from './CustomerServices';
import Login from './Login'
import Protected from './Protected'
import BookTaxi from './BookTaxi';
import RideDetails from './RideDetails';
import FinalBookingDetails from './FinalBookingDetails'
import DriverServices from './DriverServices';
function App() {
  return (
    <div className="App">
      <BrowserRouter>
       
       
      
        <Route path='/Home'>
          
          <Home />
        </Route>

        <Route activeClassName="active" path='/AdminLogin'>
          <AdminLogin />
        </Route>
        <Route activeClassName="active" path='/CustomerLogin'>
          <Login />
        </Route>
        <Route activeClassName="active" path='/DriverLogin'>
          <DriverLogin />
        </Route>
        <Route path='/BookTaxi'>
        <Protected Cmp={BookTaxi} />
          {/*<BookTaxi />*/}
        </Route>
        
        <Route path='/CustomerServices'>
        <Protected Cmp={CustomerServices}/>
        {/*  <CustomerSummary />*/}
        </Route>
        <Route path='/RideDetails'>
        
        {<RideDetails />}
        </Route>
        <Route path='/FinalBookingDetails'>
        
        {<FinalBookingDetails />}
        </Route>

        <Route path='/DriverServices'>
        
        {<DriverServices />}
        </Route>
        
      </BrowserRouter>



    </div>
  );
}

export default App;
