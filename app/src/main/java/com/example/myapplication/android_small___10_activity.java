

	

package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;

public class android_small___10_activity extends Activity {

	
	private View _bg__android_small___10_ek2;
	private View _bg__group_50_ek1;
	private View ellipse_1;
	private View ellipse_2;
	private View _bg__group_57_ek1;
	private View rectangle_64;
	private TextView crop_type;
	private View _bg__group_69_ek1;
	private View _bg__group_64_ek1;
	private View _bg__group_39_ek1;
	private View _bg__group_24_ek1;
	private View rectangle_62;
	private ImageView pngtree_indian_farmers_carry_farm_tools_png_image_6839602_1;
	private TextView government_scheme;
	private View _bg__group_70_ek1;
	private View _bg__group_68_ek1;
	private View _bg__group_63_ek1;
	private View _bg__group_62_ek1;
	private View _bg__group_58_ek1;
	private View _bg__group_24_ek3;
	private View rectangle_62_ek1;
	private TextView text;
	private ImageView _4496347_1;
	private TextView irrigation_guide;
	private View _bg__group_67_ek1;
	private View _bg__group_61_ek1;
	private View _bg__group_59_ek1;
	private View _bg__group_24_ek5;
	private View rectangle_62_ek2;
	private TextView text_ek1;
	private ImageView _6485958_1;
	private TextView ferti;
	private View _bg__group_66_ek1;
	private View _bg__group_65_ek1;
	private View _bg__group_59_ek3;
	private View _bg__group_24_ek7;
	private View rectangle_62_ek3;
	private ImageView _3464493_1;
	private TextView ferti_ek1;
	private View _bg__group_73_ek1;
	private View _bg__group_71_ek1;
	private View _bg__group_65_ek3;
	private View _bg__group_59_ek5;
	private View _bg__group_24_ek9;
	private View rectangle_62_ek4;
	private TextView ferti_ek2;
	private ImageView icon_512_1;
	private View _bg__group_72_ek1;
	private ImageView _3514853_1;
	private ImageView _2919906_1;
	private ImageView paomedia_small_n_flat_house_1;
	private ImageView _3845731_1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.android_small___10);



		_bg__group_50_ek1 = (View) findViewById(R.id._bg__group_50_ek1);
		ellipse_1 = (View) findViewById(R.id.ellipse_1);
		ellipse_2 = (View) findViewById(R.id.ellipse_2);
		_bg__group_57_ek1 = (View) findViewById(R.id._bg__group_57_ek1);
		rectangle_64 = (View) findViewById(R.id.rectangle_64);
		crop_type = (TextView) findViewById(R.id.crop_type);
		_bg__group_69_ek1 = (View) findViewById(R.id._bg__group_69_ek1);
		_bg__group_64_ek1 = (View) findViewById(R.id._bg__group_64_ek1);
		_bg__group_39_ek1 = (View) findViewById(R.id._bg__group_39_ek1);
		_bg__group_24_ek1 = (View) findViewById(R.id._bg__group_24_ek1);
		rectangle_62 = (View) findViewById(R.id.rectangle_62);
		pngtree_indian_farmers_carry_farm_tools_png_image_6839602_1 = (ImageView) findViewById(R.id.pngtree_indian_farmers_carry_farm_tools_png_image_6839602_1);
		government_scheme = (TextView) findViewById(R.id.government_scheme);
		_bg__group_70_ek1 = (View) findViewById(R.id._bg__group_70_ek1);
		_bg__group_68_ek1 = (View) findViewById(R.id._bg__group_68_ek1);

		_bg__group_66_ek1 = (View) findViewById(R.id._bg__group_66_ek1);
		_bg__group_65_ek1 = (View) findViewById(R.id._bg__group_65_ek1);
		_bg__group_59_ek3 = (View) findViewById(R.id._bg__group_59_ek3);
		_bg__group_24_ek7 = (View) findViewById(R.id._bg__group_24_ek7);
		rectangle_62_ek3 = (View) findViewById(R.id.rectangle_62_ek3);
		_3464493_1 = (ImageView) findViewById(R.id._3464493_1);
		ferti_ek1 = (TextView) findViewById(R.id.ferti_ek1);

		_bg__group_72_ek1 = (View) findViewById(R.id._bg__group_72_ek1);
		_3514853_1 = (ImageView) findViewById(R.id._3514853_1);
		_2919906_1 = (ImageView) findViewById(R.id._2919906_1);
		paomedia_small_n_flat_house_1 = (ImageView) findViewById(R.id.paomedia_small_n_flat_house_1);
		_3845731_1 = (ImageView) findViewById(R.id._3845731_1);


		rectangle_62=findViewById(R.id.rectangle_62);
		rectangle_62_ek3=findViewById(R.id.rectangle_62_ek3);
		rectangle_62_ek3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				gotoUrl ("https://kissan.ai/");
			}
		});

		rectangle_62.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				 gotoUrl ("https://kisansuvidha.gov.in/");
			}
		});
	}

	private void gotoUrl( String s){

		Uri uri=Uri.parse(s);
		startActivity(new Intent(Intent.ACTION_VIEW,uri));
	}
}
	
	