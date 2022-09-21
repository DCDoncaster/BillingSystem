import React, {useState, useEffect} from 'react';

import './App.css';
import Footer from './Components/Footer';
import NavBar from './Components/NavBar';
import Create from './Components/Create';
import Created from './Components/Created';

import Update from './Components/Update';
import Updated from './Components/Updated';
import Delete from './Components/Delete';
import Deleted from './Components/Deleted';
import Login from './Components/Login';



function App() {
const [view, setView] = useState(6);
const [formInputs, setFormInputs] = useState({});
const [loggedIn, setLoggedIn] = useState({});

const views = [
<Create formInputs={formInputs} setFormInputs={setFormInputs} view={view} setView={setView}/>, 
<Created formInputs={formInputs} view={view} setView={setView} setFormInputs={setFormInputs}/>,
<Update formInputs={formInputs} setFormInputs={setFormInputs} view={view} setView={setView}/>,
<Updated formInputs={formInputs} setFormInputs={setFormInputs} view={view} setView={setView} loggedIn={loggedIn} setLoggedIn={setLoggedIn}/>, 
<Delete formInputs={formInputs} setFormInputs={setFormInputs} view={view} setView={setView}/>,
<Deleted formInputs={formInputs} setFormInputs={setFormInputs} view={view} setView={setView}/>,
<Login formInputs={formInputs} setFormInputs={setFormInputs} view={view} setView={setView} loggedIn={loggedIn} setLoggedIn={setLoggedIn}/>
];

  
  return (
    <>
    <NavBar setView={setView} setFormInputs={setFormInputs} loggedIn={loggedIn} setLoggedIn={setLoggedIn}/>
    {views[view]}
    <Footer setView={setView}/>
    </>
  );
}

export default App;
