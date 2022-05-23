package sg.edu.np.mad.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    users user1 = new users("Minteck","hi",1, false
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = findViewById(R.id.textView);
        username.setText(user1.Name);
        TextView Description = findViewById(R.id.textView2);
        Description.setText(user1.Description);

        followed();
        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                followed();
            }
        });
    }

    public void followed()
    {
        Button btn = findViewById(R.id.button);
        user1.Followed = !(user1.Followed);
        if(!user1.Followed){
            btn.setText("Unfollow");
        }
        else {
            btn.setText("Follow");
        }
    }
    }

