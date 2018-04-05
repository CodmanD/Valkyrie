package codman.valkyrie;

import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{



    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.ivMenu)
    ImageView ivMenu;

    @BindView(R.id.drawer_layout)
    DrawerLayout mDrawerLayout;

    @BindView(R.id.navigation)
    NavigationView navigationView;

    @BindView(R.id.ll1)
    LinearLayout ll1;
    @BindView(R.id.ll2)
    LinearLayout ll2;
    @BindView(R.id.ll3)
    LinearLayout ll3;
    @BindView(R.id.ll4)
    LinearLayout ll4;
    @BindView(R.id.ll5)
    LinearLayout ll5;
    @BindView(R.id.ll6)
    LinearLayout ll6;
  //  @BindView(R.id.rv)
  //  RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        ivMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mDrawerLayout.isDrawerOpen(navigationView))
                    mDrawerLayout.closeDrawers();

                else
                    mDrawerLayout.openDrawer(navigationView);
            }
        });

//        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(mDrawerLayout.isDrawerOpen(navigationView))
//                    mDrawerLayout.closeDrawers();
//
//                else
//                    mDrawerLayout.openDrawer(navigationView);
//            }
//        });

        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        // set item as selected to persist highlight
                        menuItem.setChecked(true);
                        // close drawer when item is tapped
                        // mDrawerLayout.closeDrawers();

                        Toast.makeText(MainActivity.this,menuItem.getTitle(),Toast.LENGTH_SHORT).show();
                        // Add code here to update the UI based on the item selected
                        // For example, swap UI fragments here

                        return true;
                    }
                });


        ll1.setOnClickListener(this);
        ll2.setOnClickListener(this);
        ll3.setOnClickListener(this);
        ll4.setOnClickListener(this);
        ll5.setOnClickListener(this);
        ll6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.ll1:
                Toast.makeText(this,R.string.clothes,Toast.LENGTH_SHORT).show();
                break;
            case R.id.ll2:
                Toast.makeText(this,R.string.carpets,Toast.LENGTH_SHORT).show();
                break;
            case R.id.ll3:
                Toast.makeText(this,R.string.blankets,Toast.LENGTH_SHORT).show();
                break;
            case R.id.ll4:
                Toast.makeText(this,R.string.curtains,Toast.LENGTH_SHORT).show();
                break;
            case R.id.ll5:
                Toast.makeText(this,R.string.shoes,Toast.LENGTH_SHORT).show();
                break;
            case R.id.ll6:
                Toast.makeText(this,R.string.cushions,Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
