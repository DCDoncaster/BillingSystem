import React from "react";


function NavBar ({setView, setFormInputs,setCurrentView, loggedIn, setLoggedIn}) {




    return(<div>
            <nav className="nav" >
                    <a href="/" className="site-title" >Billing System</a>
                <ul>
                        <li className='active'> 
                        <p onClick={()=>{setView(6); setFormInputs({});}}>{loggedIn.fullname ? loggedIn.fullname : "Log In"}</p>
                        </li>
                        <li>
                        <p onClick={()=>{setView(0); setFormInputs({});}}>{!loggedIn.fullname ? "Create Account" : ""}</p>               
                        </li>
                        <li>
                        <p onClick={()=>{setView(2); setFormInputs({});}}>Update Details</p>
                        </li>
                        <li>
                        <p onClick={()=>{setView(4); setFormInputs({});}}>Delete Account</p>
                        </li>
                    <div className='navBar-btn'>

                    </div>
                </ul>
            </nav> 
        </div>)
}



export default NavBar