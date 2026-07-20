import React, { Component } from 'react';


function GuestGreeting(props) {
  return (
      <div>
        <h1>Please sign up.</h1>
        <h3>Available Flights</h3>
        <ul>
          <li>Flight AI-101: Chennai → Delhi, 06:00 AM</li>
          <li>Flight AI-202: Chennai → Mumbai, 09:30 AM</li>
          <li>Flight AI-303: Chennai → Bangalore, 01:15 PM</li>
        </ul>
        <p><i>Login to book a ticket.</i></p>
      </div>
  );
}


function UserGreeting(props) {
  return (
      <div>
        <h1>Welcome back</h1>
        <h3>Book Your Ticket</h3>
        <ul>
          <li>Flight AI-101: Chennai → Delhi, 06:00 AM <button>Book</button></li>
          <li>Flight AI-202: Chennai → Mumbai, 09:30 AM <button>Book</button></li>
          <li>Flight AI-303: Chennai → Bangalore, 01:15 PM <button>Book</button></li>
        </ul>
      </div>
  );
}


function Greeting(props) {
  const isLoggedIn = props.isLoggedIn;
  if (isLoggedIn) {
    return <UserGreeting />;
  }
  return <GuestGreeting />;
}

function LoginButton(props) {
  return (
      <button onClick={props.onClick}>
        Login
      </button>
  );
}

function LogoutButton(props) {
  return (
      <button onClick={props.onClick}>
        Logout
      </button>
  );
}

class LoginControl extends Component {
  constructor(props) {
    super(props);
    this.handleLoginClick = this.handleLoginClick.bind(this);
    this.handleLogoutClick = this.handleLogoutClick.bind(this);
    this.state = { isLoggedIn: false };
  }

  handleLoginClick() {
    this.setState({ isLoggedIn: true });
  }

  handleLogoutClick() {
    this.setState({ isLoggedIn: false });
  }

  render() {
    const isLoggedIn = this.state.isLoggedIn;
    let button;
    if (isLoggedIn) {
      button = <LogoutButton onClick={this.handleLogoutClick} />;
    } else {
      button = <LoginButton onClick={this.handleLoginClick} />;
    }

    return (
        <div>
          <Greeting isLoggedIn={isLoggedIn} />
          {button}
        </div>
    );
  }
}

class App extends Component {
  render() {
    return <LoginControl />;
  }
}

export default App;