package app.unsecret.test_app;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.Button;
import android.util.Log;
import android.widget.TextView;

//public class MainActivity extends AppCompatActivity {

   // @Override
   /* protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
*/

    public class MainActivity extends Activity {
        private static final String TAG = MainActivity.class.getSimpleName();
        Button button = null;
        String hist = null;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_main);
            Resources res = getResources();

            String chaine = res.getString(R.string.texteGras,"1");
            TextView vue = (TextView)findViewById(R.id.vue);
            vue.setText(chaine);
        }
    }
//}


