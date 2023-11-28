package ma.ofppt.bottomsheetdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ma.ofppt.bottomsheetdialog.databinding.ActivityMainBinding;
import ma.ofppt.bottomsheetdialog.fragments.MyBottomSheetDialog;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    MyBottomSheetDialog bottomSheet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnShow.setOnClickListener(view ->{
            bottomSheet = new MyBottomSheetDialog();
            bottomSheet.show(getSupportFragmentManager(),bottomSheet.getTag());
        });
    }
}