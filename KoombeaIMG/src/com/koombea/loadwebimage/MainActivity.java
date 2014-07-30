package com.koombea.loadwebimage;

import com.koombea.loadwebimage.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {
    
    ListView list;
    

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        list=(ListView)findViewById(R.id.listView1);
        
    }
    
    @Override
    public void onDestroy()
    {
        list.setAdapter(null);
        super.onDestroy();
    }
    
    private String imageUrls[] = {
    		"http://images.buycostumes.com/mgen/merchandiser/23543.jpg",
    		"http://www.townandcountryeventrentals.com/sites/default/files/marquee%20number%20-%202.jpg",
    		"https://outsideperception.files.wordpress.com/2012/02/arts-number-3_1259075598.jpg",
    		"http://upload.wikimedia.org/wikipedia/commons/d/d1/House_number_4,_place_de_la_Concorde.jpg",
    		"http://www.independent.co.uk/incoming/article8552925.ece/BINARY/original/number-5.jpg",
    		"http://upload.wikimedia.org/wikipedia/commons/1/14/Nature's_Number_6.jpg",
    		"http://www.businessforsale.sg/upload/57baff0481664143817e49b91a31579e.jpg",
    		"http://www.townandcountryeventrentals.com/sites/default/files/marquee%20number%20-%208.jpg",
    		"http://www.townandcountryeventrentals.com/sites/default/files/marquee%20number%20-%209.jpg",
    		"http://syinghana.com/wp-content/uploads/2012/08/10-number.jpg"
    }; 
}