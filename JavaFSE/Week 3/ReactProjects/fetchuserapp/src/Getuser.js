import React, { Component } from 'react';

class Getuser extends Component {
    constructor(props) {
        super(props);
        this.state = {
            results: []
        };
    }

    componentDidMount() {
        fetch("https://api.randomuser.me/")
            .then(response => response.json())
            .then(data => {
                this.setState({ results: data.results });
            })
            .catch(error => console.log(error));
    }

    render() {
        return (
            <div>
                {this.state.results.map((user, index) => (
                    <div key={index}>
                        <p>{user.name.title} {user.name.first}</p>
                        <img src={user.picture.large} alt="user" />
                    </div>
                ))}
            </div>
        );
    }
}

export default Getuser;