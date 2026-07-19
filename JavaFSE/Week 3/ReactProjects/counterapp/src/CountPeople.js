import React from 'react';

class CountPeople extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            entrycount: 0,
            exitcount: 0
        };

        // Bind methods so 'this' works correctly inside them
        this.updateEntry = this.updateEntry.bind(this);
        this.updateExit = this.updateExit.bind(this);
    }

    updateEntry() {
        this.setState({ entrycount: this.state.entrycount + 1 });
    }

    updateExit() {
        this.setState({ exitcount: this.state.exitcount + 1 });
    }

    render() {
        return (
            <div>
                <h2>Mall Entry / Exit Counter</h2>

                <button onClick={this.updateEntry}>Login</button>
                <button onClick={this.updateExit}>Exit</button>

                <p>Number of people entered the mall: {this.state.entrycount}</p>
                <p>Number of people exited the mall: {this.state.exitcount}</p>
            </div>
        );
    }
}

export default CountPeople;