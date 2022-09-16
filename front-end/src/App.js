import {useState, useEffect} from 'react';
import './App.css';
import Footer from './Components/Footer';
import NavBar from './Components/NavBar';
import Create from './Components/Create';

import Update from './Components/Update';
import Delete from './Components/Delete';




function App() {
const [view, setView] = useState(0);
const views = [<Create />, <Update />, <Delete />];

  
  return (
    <>
    <NavBar setView={setView}/>
    {views[view]}
    <Footer setView={setView}/>
    </>
  );
}

export default App;
