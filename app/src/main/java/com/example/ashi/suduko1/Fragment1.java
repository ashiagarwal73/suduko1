package com.example.ashi.suduko1;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

/**
 * Created by Ashi on 19-12-2017.
 */

public class Fragment1 extends android.support.v4.app.Fragment {
    ToggleButton t1,t2,t3,t4,t5,t6,t7,t8,t9;
    RadioGroup l1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment1,container,false);
        l1=getActivity().findViewById(R.id.numbers);
        t1=view.findViewById(R.id.toggleButton1);
        t2=view.findViewById(R.id.toggleButton2);
        t3=view.findViewById(R.id.toggleButton3);
        t4=view.findViewById(R.id.toggleButton10);
        t5=view.findViewById(R.id.toggleButton11);
        t6=view.findViewById(R.id.toggleButton12);
        t7=view.findViewById(R.id.toggleButton19);
        t8=view.findViewById(R.id.toggleButton20);
        t9=view.findViewById(R.id.toggleButton21);
        t1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t1.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb = getActivity().findViewById(i);
                            String number=rb.getText().toString();
                            t1.setText(number);
                            t1.setTextOff(number);
                            t1.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t2.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb = getActivity().findViewById(i);
                            String number=rb.getText().toString();
                            t2.setText(number);
                            t2.setTextOff(number);
                            t2.setChecked(false);

                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t3.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb = getActivity().findViewById(i);
                            String number=rb.getText().toString();
                            t3.setText(number);
                            t3.setTextOff(number);
                            t3.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t4.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb = getActivity().findViewById(i);
                            String number=rb.getText().toString();
                            t4.setText(number);
                            t4.setTextOff(number);
                            t4.setChecked(false);

                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t5.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb = getActivity().findViewById(i);
                            String number=rb.getText().toString();
                            t5.setText(number);
                            t5.setTextOff(number);
                            t5.setChecked(false);

                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t6.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb = getActivity().findViewById(i);
                            String number=rb.getText().toString();
                            t6.setText(number);
                            t6.setTextOff(number);
                            t6.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t7.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb = getActivity().findViewById(i);
                            String number=rb.getText().toString();
                            t7.setText(number);
                            t7.setTextOff(number);
                            t7.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t8.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb = getActivity().findViewById(i);
                            String number=rb.getText().toString();
                            t8.setText(number);
                            t8.setTextOff(number);
                            t8.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t9.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb = getActivity().findViewById(i);
                            String number=rb.getText().toString();
                            t9.setText(number);
                            t9.setTextOff(number);
                            t9.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });

        return view;
    }
}
