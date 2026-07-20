import React, { Component } from 'react';
import ThemeContext from './ThemeContext';
import EmployeeList from './EmployeeList';
import { employees } from './employees';
import './App.css';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = { theme: 'light' };
    this.toggleTheme = this.toggleTheme.bind(this);
  }

  toggleTheme() {
    this.setState((prevState) => ({
      theme: prevState.theme === 'light' ? 'dark' : 'light',
    }));
  }

  render() {
    return (
        <ThemeContext.Provider value={this.state.theme}>
          <div>
            <h1>Employee Management</h1>
            <button onClick={this.toggleTheme}>Toggle Theme</button>
            {/* theme is no longer passed as a prop here — only actual data is */}
            <EmployeeList employees={employees} />
          </div>
        </ThemeContext.Provider>
    );
  }
}

export default App;