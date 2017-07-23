package com.futureblink.pujiewatchface;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Uri face1 = Uri.parse("http://pujieblack.com/share/?scv2=mJRN-uO2O9iipWHY7bZ32PymK56v8HSbtaMuz6G5ecKtoWDC-aR-1_r2fs2hoXzL-vB8yLq4b466rmDLtLYm2KK2YLHM5wyxwN4EyaCiK5iq3SWz0axvhw");
    Uri face2 = Uri.parse("http://pujieblack.com/share/?scv2=nNfp0-f1nPGm9dvqpLLQ4q3vxOH5ttD-qO_Q67Hvj-qo-t3ipbLQ5aTu2LWu78v_vqHL6a37y6e-7cTisPWC8ab1xJjPobCE6_qDuuzhurHvmYyf5pXLrg");
    Uri face3 = Uri.parse("http://pujieblack.com/share/?scv2=yQCrI7Ii3QHzMYcBvCKRAahmmRWoOJhG5DOdG_EtnxH_YYZB8TWYDvxhyRXxZZhHqzGZQessiVfrOoYS5SLAAfMihmiZRv8SjV-ZG4ti43qFa5x0hmSJXg");
    Uri face4 = Uri.parse("http://pujieblack.com/share/?scv2=D3prqnRYHYg1S0eIelhRiGsbCcw3Q1-fIh9ZnTxXX8w4S0bLbUtYh21ICsxsSFLJPU5ami1WSd4tQEabI1gAiDVYRuFbGRr9IhsH_Ts5J9l4AjTNOBxJ1w");
    Uri face5 = Uri.parse("http://pujieblack.com/share/?scv2=QY4jRTqsVmd7rBAkdbkbfXi2DnN06BJodb5BcGy3QiMgoxFydO0WcCe_FSck6wFpY_gBf3CiATFjtA50baxIZ3usDg4SuxAWGOAXNQTMRB0JxWV9Mb4BOA");
    Uri face6 = Uri.parse("http://pujieblack.com/share/?scv2=ZCxqsB8OH5JeDl_UXUpS1VYfR4BTTwydUBQMg0kUXoNXAVmBVxxY1AIcXIZVSEicRlpIilUASMRGFkeBSA4Bkl4OR_s2QF_4Fm41hVdGLchSfwnTERVIzQ");
    Uri face7 = Uri.parse("http://pujieblack.com/share/?scv2=PTIWOkYQYBgHAzoYSBAsGA0KcA9eUCULEFQlCF8fIg0LBTtbCQYmFwULJgIJVHAMXAEjDR8eNE4fCDsLERB9GAcQO3FvWSBMaGEiQ2lFQAtYSk5pDWY0Rw");
    Uri face8 = Uri.parse("http://pujieblack.com/share/?scv2=SAyP2jMu-vhyLr3oK225u3Bqor9wPr73fDTruGVt6r4pIbzuKzzpv35q6-l_b632anqt4Hkgra5qNqLrZC7k-HIuopEab9icEHn3jTt6vekSZNi0J1ytpw");
    Uri face9 = Uri.parse("http://pujieblack.com/share/?scv2=NUQXCU5mYisPZiA-V3AmPAZzOjlXcS4kAXx0bRh9JzhXaXI6VHMnawNyIjhWJjUlFzI1MwRoNX0Xfjo4GWZ8Kw9mOkJkI2cxASVPUGwCOkZnAGNPWD01dA");
    Uri face10 = Uri.parse("http://pujieblack.com/share/?scv2=OVtNlkJ5OLQDeXinDz909Qo-YK5dYn-7DWh89BQ5K_cAdn6uWz0upA1sKPUJaG-6Gy1vrAh3b-IbYWCnFXkmtAN5YN1rYxXlbAMb_lJtPs9_Ngf0ShRv6w");


    Uri creditsface1 = Uri.parse("https://plus.google.com/+MehdiBrahmi");
    Uri creditsface2 = Uri.parse("https://plus.google.com/109862967609841856799");
    Uri creditsface3 = Uri.parse("https://plus.google.com/+MehdiBrahmi");
    Uri creditsface4 = Uri.parse("https://plus.google.com/+FahedAlFaris");
    Uri creditsface5 = Uri.parse("https://plus.google.com/116609438419738430453");
    Uri creditsface6 = Uri.parse("https://plus.google.com/116609438419738430453");
    Uri creditsface7 = Uri.parse("https://plus.google.com/112877302255451442477");
    Uri creditsface8 = Uri.parse("https://plus.google.com/109415511074141226552");
    Uri creditsface9 = Uri.parse("https://plus.google.com/103414323699905910234");
    Uri creditsface10 = Uri.parse("https://plus.google.com/109862967609841856799");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onface1(View view) {
        Intent face1intent = new Intent(Intent.ACTION_VIEW, face1);
        startActivity(face1intent);
    }

    public void onface2(View view) {
        Intent face2Intent = new Intent(Intent.ACTION_VIEW, face2);
        startActivity(face2Intent);
    }

    public void onface3(View view) {
        Intent face3Intent = new Intent(Intent.ACTION_VIEW, face3);
        startActivity(face3Intent);
    }

    public void onface4(View view) {
        Intent face4Intent = new Intent(Intent.ACTION_VIEW, face4);
        startActivity(face4Intent);
    }

    public void onface5(View view) {
        Intent face5Intent = new Intent(Intent.ACTION_VIEW, face5);
        startActivity(face5Intent);
    }

    public void onface6(View view) {
        Intent face6Intent = new Intent(Intent.ACTION_VIEW, face6);
        startActivity(face6Intent);
    }

    public void onface7(View view) {
        Intent face7Intent = new Intent(Intent.ACTION_VIEW, face7);
        startActivity(face7Intent);
    }

    public void onface8(View view) {
        Intent face8Intent = new Intent(Intent.ACTION_VIEW, face8);
        startActivity(face8Intent);
    }

    public void onface9(View view) {
        Intent face9Intent = new Intent(Intent.ACTION_VIEW, face9);
        startActivity(face9Intent);
    }

    public void onface10(View view) {
        Intent face10Intent = new Intent(Intent.ACTION_VIEW, face10);
        startActivity(face10Intent);
    }
    public void onfacecredit1(View view) {
        Intent creditIntent = new Intent(Intent.ACTION_VIEW, creditsface1);
        startActivity(creditIntent);
    }
    public void onfacecredit2(View view) {
        Intent creditIntent = new Intent(Intent.ACTION_VIEW, creditsface2);
        startActivity(creditIntent);
    }
    public void onfacecredit3(View view) {
        Intent creditIntent = new Intent(Intent.ACTION_VIEW, creditsface3);
        startActivity(creditIntent);
    }
    public void onfacecredit4(View view) {
        Intent creditIntent = new Intent(Intent.ACTION_VIEW, creditsface4);
        startActivity(creditIntent);
    }
    public void onfacecredit5(View view) {
        Intent creditIntent = new Intent(Intent.ACTION_VIEW, creditsface5);
        startActivity(creditIntent);
    }
    public void onfacecredit6(View view) {
        Intent creditIntent = new Intent(Intent.ACTION_VIEW, creditsface6);
        startActivity(creditIntent);
    }
    public void onfacecredit7(View view) {
        Intent creditIntent = new Intent(Intent.ACTION_VIEW, creditsface7);
        startActivity(creditIntent);
    }
    public void onfacecredit8(View view) {
        Intent creditIntent = new Intent(Intent.ACTION_VIEW, creditsface8);
        startActivity(creditIntent);
    }
    public void onfacecredit9(View view) {
        Intent creditIntent = new Intent(Intent.ACTION_VIEW, creditsface9);
        startActivity(creditIntent);
    }
    public void onfacecredit10(View view) {
        Intent creditIntent = new Intent(Intent.ACTION_VIEW, creditsface10);
        startActivity(creditIntent);
    }


}
