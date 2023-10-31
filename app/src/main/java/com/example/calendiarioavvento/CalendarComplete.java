package com.example.calendiarioavvento;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import com.google.android.material.imageview.ShapeableImageView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class CalendarComplete extends AppCompatActivity {

    private ConstraintLayout calendar_complete_element_1, calendar_complete_element_2, calendar_complete_element_3,
            calendar_complete_element_4, calendar_complete_element_5, calendar_complete_element_6, calendar_complete_element_7,
            calendar_complete_element_8, calendar_complete_element_9, calendar_complete_element_10, calendar_complete_element_11,
            calendar_complete_element_12, calendar_complete_element_13, calendar_complete_element_14, calendar_complete_element_15,
            calendar_complete_element_16, calendar_complete_element_17, calendar_complete_element_18, calendar_complete_element_19,
            calendar_complete_element_20, calendar_complete_element_21, calendar_complete_element_22, calendar_complete_element_23,
            calendar_complete_element_24;
    public static ShapeableImageView calendar_img1, calendar_img2, calendar_img3, calendar_img4, calendar_img5, calendar_img6,
            calendar_img7, calendar_img8, calendar_img9, calendar_img10, calendar_img11, calendar_img12, calendar_img13,
            calendar_img14, calendar_img15, calendar_img16, calendar_img17, calendar_img18, calendar_img19, calendar_img20,
            calendar_img21, calendar_img22, calendar_img23, calendar_img24;
    private List<ConstraintLayout> element_list_constraint = new ArrayList<>();
    private List<ShapeableImageView> element_list_img = new ArrayList<>();
    private int current_day;
    private int current_month;
    String URL = "https://calendiarioavvento-default-rtdb.europe-west1.firebasedatabase.app/";
    DatabaseReference databaseReference;
    List<Integer> opened = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitvity_calendar_complete);
        getSupportActionBar().hide();

        if (true) {
            calendar_complete_element_1 = findViewById(R.id.calendar_complete_element_1);
            calendar_complete_element_2 = findViewById(R.id.calendar_complete_element_2);
            calendar_complete_element_3 = findViewById(R.id.calendar_complete_element_3);
            calendar_complete_element_4 = findViewById(R.id.calendar_complete_element_4);
            calendar_complete_element_5 = findViewById(R.id.calendar_complete_element_5);
            calendar_complete_element_6 = findViewById(R.id.calendar_complete_element_6);
            calendar_complete_element_7 = findViewById(R.id.calendar_complete_element_7);
            calendar_complete_element_8 = findViewById(R.id.calendar_complete_element_8);
            calendar_complete_element_9 = findViewById(R.id.calendar_complete_element_9);
            calendar_complete_element_10 = findViewById(R.id.calendar_complete_element_10);
            calendar_complete_element_11 = findViewById(R.id.calendar_complete_element_11);
            calendar_complete_element_12 = findViewById(R.id.calendar_complete_element_12);
            calendar_complete_element_13 = findViewById(R.id.calendar_complete_element_13);
            calendar_complete_element_14 = findViewById(R.id.calendar_complete_element_14);
            calendar_complete_element_15 = findViewById(R.id.calendar_complete_element_15);
            calendar_complete_element_16 = findViewById(R.id.calendar_complete_element_16);
            calendar_complete_element_17 = findViewById(R.id.calendar_complete_element_17);
            calendar_complete_element_18 = findViewById(R.id.calendar_complete_element_18);
            calendar_complete_element_19 = findViewById(R.id.calendar_complete_element_19);
            calendar_complete_element_20 = findViewById(R.id.calendar_complete_element_20);
            calendar_complete_element_21 = findViewById(R.id.calendar_complete_element_21);
            calendar_complete_element_22 = findViewById(R.id.calendar_complete_element_22);
            calendar_complete_element_23 = findViewById(R.id.calendar_complete_element_23);
            calendar_complete_element_24 = findViewById(R.id.calendar_complete_element_24);

            calendar_img1 = findViewById(R.id.calendar_img1);
            calendar_img2 = findViewById(R.id.calendar_img2);
            calendar_img3 = findViewById(R.id.calendar_img3);
            calendar_img4 = findViewById(R.id.calendar_img4);
            calendar_img5 = findViewById(R.id.calendar_img5);
            calendar_img6 = findViewById(R.id.calendar_img6);
            calendar_img7 = findViewById(R.id.calendar_img7);
            calendar_img8 = findViewById(R.id.calendar_img8);
            calendar_img9 = findViewById(R.id.calendar_img9);
            calendar_img10 = findViewById(R.id.calendar_img10);
            calendar_img11 = findViewById(R.id.calendar_img11);
            calendar_img12 = findViewById(R.id.calendar_img12);
            calendar_img13 = findViewById(R.id.calendar_img13);
            calendar_img14 = findViewById(R.id.calendar_img14);
            calendar_img15 = findViewById(R.id.calendar_img15);
            calendar_img16 = findViewById(R.id.calendar_img16);
            calendar_img17 = findViewById(R.id.calendar_img17);
            calendar_img18 = findViewById(R.id.calendar_img18);
            calendar_img19 = findViewById(R.id.calendar_img19);
            calendar_img20 = findViewById(R.id.calendar_img20);
            calendar_img21 = findViewById(R.id.calendar_img21);
            calendar_img22 = findViewById(R.id.calendar_img22);
            calendar_img23 = findViewById(R.id.calendar_img23);
            calendar_img24 = findViewById(R.id.calendar_img24);
        }

        if (true) {
            element_list_constraint.add(calendar_complete_element_1);
            element_list_constraint.add(calendar_complete_element_2);
            element_list_constraint.add(calendar_complete_element_3);
            element_list_constraint.add(calendar_complete_element_4);
            element_list_constraint.add(calendar_complete_element_5);
            element_list_constraint.add(calendar_complete_element_6);
            element_list_constraint.add(calendar_complete_element_7);
            element_list_constraint.add(calendar_complete_element_8);
            element_list_constraint.add(calendar_complete_element_9);
            element_list_constraint.add(calendar_complete_element_10);
            element_list_constraint.add(calendar_complete_element_11);
            element_list_constraint.add(calendar_complete_element_12);
            element_list_constraint.add(calendar_complete_element_13);
            element_list_constraint.add(calendar_complete_element_14);
            element_list_constraint.add(calendar_complete_element_15);
            element_list_constraint.add(calendar_complete_element_16);
            element_list_constraint.add(calendar_complete_element_17);
            element_list_constraint.add(calendar_complete_element_18);
            element_list_constraint.add(calendar_complete_element_19);
            element_list_constraint.add(calendar_complete_element_20);
            element_list_constraint.add(calendar_complete_element_21);
            element_list_constraint.add(calendar_complete_element_22);
            element_list_constraint.add(calendar_complete_element_23);
            element_list_constraint.add(calendar_complete_element_24);

            element_list_img.add(calendar_img1);
            element_list_img.add(calendar_img2);
            element_list_img.add(calendar_img3);
            element_list_img.add(calendar_img4);
            element_list_img.add(calendar_img5);
            element_list_img.add(calendar_img6);
            element_list_img.add(calendar_img7);
            element_list_img.add(calendar_img8);
            element_list_img.add(calendar_img9);
            element_list_img.add(calendar_img10);
            element_list_img.add(calendar_img11);
            element_list_img.add(calendar_img12);
            element_list_img.add(calendar_img13);
            element_list_img.add(calendar_img14);
            element_list_img.add(calendar_img15);
            element_list_img.add(calendar_img16);
            element_list_img.add(calendar_img17);
            element_list_img.add(calendar_img18);
            element_list_img.add(calendar_img19);
            element_list_img.add(calendar_img20);
            element_list_img.add(calendar_img21);
            element_list_img.add(calendar_img22);
            element_list_img.add(calendar_img23);
            element_list_img.add(calendar_img24);
        }

        databaseReference = FirebaseDatabase.getInstance(URL).getReference().child("opened");
        databaseReference.keepSynced(true);
        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()) {
                    opened.add(Integer.parseInt(dataSnapshot1.getKey()));
                }
                for (Integer number : opened) {
                    ShapeableImageView img = element_list_img.get(number-1);
                    switch (number) {
                        case 1:
                            img.setImageResource(R.drawable.hidden_img1);
                            break;
                        case 2:
                            img.setImageResource(R.drawable.f_1);
                            break;
                        case 3:
                            img.setImageResource(R.drawable.s_1);
                            break;
                        case 4:
                            img.setImageResource(R.drawable.mb_1);
                            break;
                        case 5:
                            img.setImageResource(R.drawable.p_f1);
                            break;
                        case 6:
                            img.setImageResource(R.drawable.t_3);
                            break;
                        case 7:
                            img.setImageResource(R.drawable.s_2);
                            break;
                        case 8:
                            img.setImageResource(R.drawable.mb_2_static);
                            break;
                        case 9:
                            img.setImageResource(R.drawable.gen_2);
                            break;
                        case 10:
                            img.setImageResource(R.drawable.t_2);
                            break;
                        case 11:
                            img.setImageResource(R.drawable.f_3);
                            break;
                        case 12:
                            img.setImageResource(R.drawable.gen_4);
                            break;
                        case 13:
                            img.setImageResource(R.drawable.mb_meme_1);
                            break;
                        case 14:
                            img.setImageResource(R.drawable.t_1);
                            break;
                        case 15:
                            img.setImageResource(R.drawable.gen_5);
                            break;
                        case 16:
                            img.setImageResource(R.drawable.f_2);
                            break;
                        case 17:
                            img.setImageResource(R.drawable.gen_3);
                            break;
                        case 18:
                            img.setImageResource(R.drawable.t_4);
                            break;
                        case 19:
                            img.setImageResource(R.drawable.min_1);
                            break;
                        case 20:
                            img.setImageResource(R.drawable.gen_1);
                            break;
                        case 21:
                            img.setImageResource(R.drawable.cb_1);
                            break;
                        case 22:
                            img.setImageResource(R.drawable.p_2);
                            break;
                        case 23:
                            img.setImageResource(R.drawable.n_1);
                            break;
                        case 24:
                            img.setImageResource(R.drawable.last_photo);
                            break;
                    }
                    img.setScaleType(ImageView.ScaleType.CENTER_CROP);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                //set code to show an error
                Toast.makeText(getApplicationContext(), "No Data", Toast.LENGTH_SHORT).show();
            }
        });

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            current_day = LocalDate.now(ZoneId.systemDefault()).getDayOfMonth();
            current_month = LocalDate.now(ZoneId.systemDefault()).getMonth().getValue();
        }
        System.out.println(current_month);

        if (current_month == 12) {
            calendar_complete_element_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (current_day >= 1) {
                        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                snapshot.getRef().child("1").setValue("1");
                                Intent intent = new Intent(CalendarComplete.this, ShowElement.class);
                                intent.putExtra("key", 1);
                                startActivity(intent);
                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });
                    }
                }
            });
            calendar_complete_element_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (current_day >= 2) {
                        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                snapshot.getRef().child("2").setValue("2");
                                Intent intent = new Intent(CalendarComplete.this, ShowElement.class);
                                intent.putExtra("key", 2);
                                startActivity(intent);
                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });
                    }
                }
            });
            calendar_complete_element_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (current_day >= 3) {
                        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                snapshot.getRef().child("3").setValue("3");
                                Intent intent = new Intent(CalendarComplete.this, ShowElement.class);
                                intent.putExtra("key", 3);
                                startActivity(intent);

                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });
                    }
                }
            });
            calendar_complete_element_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (current_day >= 4) {
                        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                snapshot.getRef().child("4").setValue("4");
                                Intent intent = new Intent(CalendarComplete.this, ShowElement.class);
                                intent.putExtra("key", 4);
                                startActivity(intent);

                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });
                    }
                }
            });
            calendar_complete_element_5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (current_day >= 5) {
                        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                snapshot.getRef().child("5").setValue("5");
                                Intent intent = new Intent(CalendarComplete.this, ShowElement.class);
                                intent.putExtra("key", 5);
                                startActivity(intent);

                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });
                    }
                }
            });
            calendar_complete_element_6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (current_day >= 6) {
                        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                snapshot.getRef().child("6").setValue("6");
                                Intent intent = new Intent(CalendarComplete.this, ShowElement.class);
                                intent.putExtra("key", 6);
                                startActivity(intent);

                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });
                    }
                }
            });
            calendar_complete_element_7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (current_day >= 7) {
                        System.out.println("entrato in 7");
                        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                snapshot.getRef().child("7").setValue("7");
                                Intent intent = new Intent(CalendarComplete.this, ShowElement.class);
                                intent.putExtra("key", 7);
                                startActivity(intent);

                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });
                    }
                }
            });
            calendar_complete_element_8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (current_day >= 8) {
                        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                snapshot.getRef().child("8").setValue("8");
                                Intent intent = new Intent(CalendarComplete.this, ShowElement.class);
                                intent.putExtra("key", 8);
                                startActivity(intent);

                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });
                    }
                }
            });
            calendar_complete_element_9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (current_day >= 9) {
                        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                snapshot.getRef().child("9").setValue("9");
                                Intent intent = new Intent(CalendarComplete.this, ShowElement.class);
                                intent.putExtra("key", 9);
                                startActivity(intent);

                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });
                    }
                }
            });
            calendar_complete_element_10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (current_day >= 10) {
                        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                snapshot.getRef().child("10").setValue("10");
                                Intent intent = new Intent(CalendarComplete.this, ShowElement.class);
                                intent.putExtra("key", 10);
                                startActivity(intent);

                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });
                    }
                }
            });
            calendar_complete_element_11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (current_day >= 11) {
                        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                snapshot.getRef().child("11").setValue("11");
                                Intent intent = new Intent(CalendarComplete.this, ShowElement.class);
                                intent.putExtra("key", 11);
                                startActivity(intent);

                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });
                    }
                }
            });
            calendar_complete_element_12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (current_day >= 12) {
                        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                snapshot.getRef().child("12").setValue("12");
                                Intent intent = new Intent(CalendarComplete.this, ShowElement.class);
                                intent.putExtra("key", 12);
                                startActivity(intent);

                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });
                    }
                }
            });
            calendar_complete_element_13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (current_day >= 13) {
                        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                snapshot.getRef().child("13").setValue("13");
                                Intent intent = new Intent(CalendarComplete.this, ShowElement.class);
                                intent.putExtra("key", 13);
                                startActivity(intent);

                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });
                    }
                }
            });
            calendar_complete_element_14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (current_day >= 14) {
                        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                snapshot.getRef().child("14").setValue("14");
                                Intent intent = new Intent(CalendarComplete.this, ShowElement.class);
                                intent.putExtra("key", 14);
                                startActivity(intent);

                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });
                    }
                }
            });
            calendar_complete_element_15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (current_day >= 15) {
                        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                snapshot.getRef().child("15").setValue("15");
                                Intent intent = new Intent(CalendarComplete.this, ShowElement.class);
                                intent.putExtra("key", 15);
                                startActivity(intent);

                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });
                    }
                }
            });
            calendar_complete_element_16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (current_day >= 16) {
                        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                snapshot.getRef().child("16").setValue("16");
                                Intent intent = new Intent(CalendarComplete.this, ShowElement.class);
                                intent.putExtra("key", 16);
                                startActivity(intent);

                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });
                    }
                }
            });
            calendar_complete_element_17.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (current_day >= 17) {
                        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                snapshot.getRef().child("17").setValue("17");
                                Intent intent = new Intent(CalendarComplete.this, ShowElement.class);
                                intent.putExtra("key", 17);
                                startActivity(intent);

                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });
                    }
                }
            });
            calendar_complete_element_18.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (current_day >= 18) {
                        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                snapshot.getRef().child("18").setValue("18");
                                Intent intent = new Intent(CalendarComplete.this, ShowElement.class);
                                intent.putExtra("key", 18);
                                startActivity(intent);

                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });
                    }
                }
            });
            calendar_complete_element_19.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (current_day >= 19) {
                        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                snapshot.getRef().child("19").setValue("19");
                                Intent intent = new Intent(CalendarComplete.this, ShowElement.class);
                                intent.putExtra("key", 19);
                                startActivity(intent);

                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });
                    }
                }
            });
            calendar_complete_element_20.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (current_day >= 20) {
                        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                snapshot.getRef().child("20").setValue("20");
                                Intent intent = new Intent(CalendarComplete.this, ShowElement.class);
                                intent.putExtra("key", 20);
                                startActivity(intent);

                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });
                    }
                }
            });
            calendar_complete_element_21.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (current_day >= 21) {
                        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                snapshot.getRef().child("21").setValue("21");
                                Intent intent = new Intent(CalendarComplete.this, ShowElement.class);
                                intent.putExtra("key", 21);
                                startActivity(intent);

                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });
                    }
                }
            });
            calendar_complete_element_22.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (current_day >= 22) {
                        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                snapshot.getRef().child("22").setValue("22");
                                Intent intent = new Intent(CalendarComplete.this, ShowElement.class);
                                intent.putExtra("key", 22);
                                startActivity(intent);

                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });
                    }
                }
            });
            calendar_complete_element_23.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (current_day >= 23) {
                        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                snapshot.getRef().child("23").setValue("23");
                                Intent intent = new Intent(CalendarComplete.this, ShowElement.class);
                                intent.putExtra("key", 23);
                                startActivity(intent);
                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });
                    }
                }
            });
            calendar_complete_element_24.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (current_day >= 24) {
                        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                snapshot.getRef().child("24").setValue("24");
                                Intent intent = new Intent(CalendarComplete.this, ShowElement.class);
                                intent.putExtra("key", 24);
                                startActivity(intent);
                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });
                    }
                }
            });
        }
    }
}