function ListOfPlayers() {

    const players = [

        { name: "Sachin", score: 95 },
        { name: "Virat", score: 88 },
        { name: "Dhoni", score: 67 },
        { name: "Rohit", score: 76 },
        { name: "Hardik", score: 52 },
        { name: "Rahul", score: 91 },
        { name: "Pant", score: 69 },
        { name: "Gill", score: 84 },
        { name: "Jadeja", score: 73 },
        { name: "Bumrah", score: 65 },
        { name: "Shami", score: 58 }

    ];

    const lowScorePlayers = players.filter(
        player => player.score < 70
    );

    return (

        <div>

            <h2>List of Players</h2>

            <table border="1" cellPadding="8">

                <thead>

                <tr>

                    <th>Name</th>
                    <th>Score</th>

                </tr>

                </thead>

                <tbody>

                {
                    players.map((player,index)=>(

                        <tr key={index}>

                            <td>{player.name}</td>
                            <td>{player.score}</td>

                        </tr>

                    ))
                }

                </tbody>

            </table>

            <br/>

            <h2>Players with Score Below 70</h2>

            <ul>

                {

                    lowScorePlayers.map((player,index)=>

                        <li key={index}>
                            {player.name} - {player.score}
                        </li>

                    )

                }

            </ul>

        </div>

    );

}

export default ListOfPlayers;