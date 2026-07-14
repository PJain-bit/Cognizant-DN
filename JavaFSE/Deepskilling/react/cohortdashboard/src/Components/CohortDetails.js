import styles from "../Styles/CohortDetails.module.css";

function CohortDetails(props) {

    return (

        <div className={styles.box}>

            <h3
                style={{
                    color: props.status === "ongoing" ? "green" : "blue"
                }}
            >
                {props.name}
            </h3>

            <dl>

                <dt>Current Status</dt>
                <dd>{props.status}</dd>

                <dt>Coach</dt>
                <dd>{props.coach}</dd>

                <dt>Trainer</dt>
                <dd>{props.trainer}</dd>

            </dl>

        </div>

    );

}

export default CohortDetails;