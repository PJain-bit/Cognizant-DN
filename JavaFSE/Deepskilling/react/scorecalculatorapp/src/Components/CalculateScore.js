import React from "react";
import "../Stylesheets/mystyle.css";

function CalculateScore(props) {

    const average = props.Total / props.Goal;

    return (
        <div className="box">
            <h2>Student Score Card</h2>

            <p><strong>Name:</strong> {props.Name}</p>

            <p><strong>School:</strong> {props.School}</p>

            <p><strong>Total Marks:</strong> {props.Total}</p>

            <p><strong>Total Subjects:</strong> {props.Goal}</p>

            <h3>Average Score: {average.toFixed(2)}</h3>
        </div>
    );
}

export default CalculateScore;