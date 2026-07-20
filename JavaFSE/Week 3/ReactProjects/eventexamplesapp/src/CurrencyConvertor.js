import React, { Component } from 'react';

class CurrencyConvertor extends Component {
    constructor(props) {
        super(props);
        this.state = { amount: '', currency: '' };

        this.handleAmountChange = this.handleAmountChange.bind(this);
        this.handleCurrencyChange = this.handleCurrencyChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleAmountChange(event) {
        this.setState({ amount: event.target.value });
    }

    handleCurrencyChange(event) {
        this.setState({ currency: event.target.value });
    }

    handleSubmit(event) {
        event.preventDefault();
        const conversionRate = 80; // 1 unit -> 80 (matches the sample output: 80 * 80 = 6400)
        const converted = this.state.amount * conversionRate;
        alert(`Converting to ${this.state.currency} Amount is ${converted}`);
    }

    render() {
        return (
            <div>
                <h2 style={{ color: 'green' }}>Currency Convertor!!!</h2>
                <form onSubmit={this.handleSubmit}>
                    <label>Amount: </label>
                    <input type="text" value={this.state.amount} onChange={this.handleAmountChange} />
                    <br />
                    <label>Currency: </label>
                    <input type="text" value={this.state.currency} onChange={this.handleCurrencyChange} />
                    <br />
                    <button type="submit">Submit</button>
                </form>
            </div>
        );
    }
}

export default CurrencyConvertor;