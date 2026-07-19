import React from 'react';
import Cart from './Cart';

class OnlineShopping extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            items: [
                { itemName: "Laptop", price: 55000 },
                { itemName: "Headphones", price: 1500 },
                { itemName: "Keyboard", price: 800 },
                { itemName: "Mouse", price: 500 },
                { itemName: "Monitor", price: 12000 }
            ]
        };
    }

    render() {
        return (
            <div>
                <h2>Online Shopping Cart</h2>
                {this.state.items.map((item, index) => (
                    <Cart key={index} itemName={item.itemName} price={item.price} />
                ))}
            </div>
        );
    }
}

export default OnlineShopping;