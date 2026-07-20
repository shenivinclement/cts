function ListOfPlayers() {
    // ES6 const + array of 11 player objects
    const players = [
        { name: "Rohit Sharma", score: 85 },
        { name: "Virat Kohli", score: 92 },
        { name: "Shubman Gill", score: 60 },
        { name: "KL Rahul", score: 45 },
        { name: "Suryakumar Yadav", score: 78 },
        { name: "Hardik Pandya", score: 55 },
        { name: "Ravindra Jadeja", score: 40 },
        { name: "Axar Patel", score: 65 },
        { name: "Jasprit Bumrah", score: 15 },
        { name: "Mohammed Shami", score: 10 },
        { name: "Kuldeep Yadav", score: 20 }
    ];

    // ES6 arrow function + filter: players scoring below 70
    const lowScorers = players.filter((player) => player.score < 70);

    return (
        <div>
            <h2>List of Players</h2>
            {/* ES6 map() to render all players */}
            {players.map((player, index) => (
                <p key={index}>{player.name} - {player.score}</p>
            ))}

            <h3>Players with score below 70</h3>
            {lowScorers.map((player, index) => (
                <p key={index}>{player.name} - {player.score}</p>
            ))}
        </div>
    );
}

export default ListOfPlayers;