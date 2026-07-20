function IndianPlayers() {
    const players = [
        "Rohit Sharma", "Virat Kohli", "Shubman Gill", "KL Rahul",
        "Suryakumar Yadav", "Hardik Pandya", "Ravindra Jadeja",
        "Axar Patel", "Jasprit Bumrah", "Mohammed Shami", "Kuldeep Yadav"
    ];

    // ES6 destructuring: pull out players by position
    const [first, second, third, ...rest] = players;

    const oddTeamPlayers = players.filter((_, index) => index % 2 === 0);
    const evenTeamPlayers = players.filter((_, index) => index % 2 !== 0);

    // Two separate arrays to merge
    const T20players = ["Rohit Sharma", "Virat Kohli", "Suryakumar Yadav"];
    const RanjiTrophyPlayers = ["Prithvi Shaw", "Sarfaraz Khan", "Yashasvi Jaiswal"];

    // ES6 spread operator - merging arrays
    const mergedPlayers = [...T20players, ...RanjiTrophyPlayers];

    return (
        <div>
            <h2>Indian Players</h2>

            <h3>Odd Team Players</h3>
            {oddTeamPlayers.map((player, index) => (
                <p key={index}>{player}</p>
            ))}

            <h3>Even Team Players</h3>
            {evenTeamPlayers.map((player, index) => (
                <p key={index}>{player}</p>
            ))}

            <h3>Merged Team (T20 + Ranji Trophy)</h3>
            {mergedPlayers.map((player, index) => (
                <p key={index}>{player}</p>
            ))}
        </div>
    );
}

export default IndianPlayers;