import React from 'react';

class Cart extends React.Component {
    render() {
        return (
            <div>
                <p>
                    Item: {this.props.itemName} — Price: ₹{this.props.price}
                </p>
            </div>
        );
    }
}

export default Cart;