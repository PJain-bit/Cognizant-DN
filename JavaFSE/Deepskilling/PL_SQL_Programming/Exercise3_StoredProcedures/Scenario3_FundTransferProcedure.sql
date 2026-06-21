CREATE OR REPLACE PROCEDURE TransferFunds(

    p_source_account IN NUMBER,
    p_target_account IN NUMBER,
    p_amount IN NUMBER

)

AS

    v_balance NUMBER;

BEGIN

    SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE AccountID =
          p_source_account;

    IF v_balance >= p_amount THEN

        UPDATE Accounts
        SET Balance =
            Balance - p_amount
        WHERE AccountID =
              p_source_account;

        UPDATE Accounts
        SET Balance =
            Balance + p_amount
        WHERE AccountID =
              p_target_account;

        DBMS_OUTPUT.PUT_LINE(
            'Transfer Successful'
        );

        COMMIT;

    ELSE

        DBMS_OUTPUT.PUT_LINE(
            'Insufficient Balance'
        );

    END IF;

END;
/