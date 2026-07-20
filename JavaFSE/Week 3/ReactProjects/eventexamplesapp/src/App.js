import React, { Component } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = { counter: 5 };

    this.handleIncrement = this.handleIncrement.bind(this);
    this.handleDecrement = this.handleDecrement.bind(this);
    this.sayHello = this.sayHello.bind(this);
    this.handleWelcome = this.handleWelcome.bind(this);
    this.handleClick = this.handleClick.bind(this);
  }

  handleIncrement() {
    this.setState({ counter: this.state.counter + 1 });
    this.sayHello();
  }

  handleDecrement() {
    this.setState({ counter: this.state.counter - 1 });
  }

  sayHello() {
    alert('Hello! Member1');
  }

  handleWelcome(message) {
    alert(message);
  }

  handleClick(event) {
    // event here is React's SyntheticEvent
    alert('I was clicked');
  }

  render() {
    return (
        <div>
          <h2>{this.state.counter}</h2>
          <button onClick={this.handleIncrement}>Increment</button>
          <button onClick={this.handleDecrement}>Decrement</button>
          <button onClick={() => this.handleWelcome('welcome')}>Say welcome</button>
          <button onClick={this.handleClick}>Click on me</button>

          <CurrencyConvertor />
        </div>
    );
  }
}

export default App;