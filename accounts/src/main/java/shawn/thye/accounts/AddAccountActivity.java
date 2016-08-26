/*
 * Created by shawnthye on 25/08/2016.
 */

package shawn.thye.accounts;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class AddAccountActivity extends AppCompatActivity {
    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.add_account_activity);
        super.onCreate(savedInstanceState);

        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                final String accountName1 = "Anonymous";
                Account account1 = new Account(accountName1, "shawn.thye");

                final String accountName2 = "Anonymous2";
                Account account2 = new Account(accountName2, "shawn.thye");

                AccountManager accountManager = (AccountManager) getSystemService(ACCOUNT_SERVICE);
                accountManager.addAccountExplicitly(account1, null, null);
                accountManager.addAccountExplicitly(account2, null, null);
            }
        });
    }
}
