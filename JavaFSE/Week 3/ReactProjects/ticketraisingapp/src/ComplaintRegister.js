import React, { Component } from 'react';

class ComplaintRegister extends Component {
    constructor(props) {
        super(props);
        this.state = {
            ename: '',
            ecomplaint: '',
            NumberHolder: '',
        };

        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    // one generic handler for every input, using the input's "name" attribute
    handleChange(event) {
        this.setState({ [event.target.name]: event.target.value });
    }

    handleSubmit(event) {
        const refNumber = Math.floor(Math.random() * 100);

        var msg =
            'Thanks ' +
            this.state.ename +
            '\n Your Complaint was Submitted \n Transaction ID is: ' +
            refNumber;

        alert(msg);
        this.setState({ NumberHolder: refNumber });
        event.preventDefault();
    }

    render() {
        return (
            <div>
                <h1 style={{ color: 'red' }}>Register your complaints here!!!</h1>
                <form onSubmit={this.handleSubmit}>
                    <label>Name: </label>
                    <input
                        type="text"
                        name="ename"
                        value={this.state.ename}
                        onChange={this.handleChange}
                    />
                    <br />
                    <br />
                    <label>Complaint: </label>
                    <textarea
                        name="ecomplaint"
                        value={this.state.ecomplaint}
                        onChange={this.handleChange}
                    />
                    <br />
                    <br />
                    <button type="submit">Submit</button>
                </form>
            </div>
        );
    }
}

export default ComplaintRegister;