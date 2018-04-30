# DataBindingExample
A demo of how to implement Data Binding in Android app</br></br>


<img src="https://github.com/anitaa1990/DataBindingExample/blob/master/demo.png" width="200" style="max-width:100%;"><br/><br/>


Each Activity in the demo app shows a sample implementation of data binding.<br/>
1. <h4>Replace findViewById  with data binding</h4>
  Step 1: In layout file, make ```<layout>``` tag as most parent tag or root tag. After adding it, build system will process it for data binding.<br/>
  Step 2: After above step, binding class will be generated based on same name of layout file (e.g. activity_main’s binding class will be generated as ActivityMainBinding). Set setContentView using DataBindingUtil.<br/>
  That’s it.<br/>
  Example: ```DataBinding1Activity```<br/><br/>
  
2. <h4>How can we change binding class name?</h4>
By default, binding class is generated based on the name of the layout file and placed in a data binding package under the module package. E.g. the layout file activity_main.xml will generate ActivityMainBinding. If the module package is com.an.demo, then it will be placed in com.an.demo.databinding directory.<br/>
We can change that by adding this tag ```<data class="MainActivityBinding">``` to the layout file.<br/>Now generated binding class is named MainActivityBinding<br/>
  That’s it.<br/>
  Example: ```DataBinding2Activity```<br/><br/>
  
  
3. <h4>How to bind data in layout file?</h4>
Step 1: Create a POJO class i.e. User<br/>
Step 2: Add <data> element to the layout file. <data> element is a way to binding data with UI element.<br/>
Step 3: Add <variable> element to the layout file. <variable> is a object of POJO which we bind with UI.<br/>
Step 4: add ```@{user.name}``` in text property of TextView. Generally, Expressions within the layout are written in the attribute properties using the ```@{}``` syntax<br/>
Step 4: Set ```binding.setUser(user);``` in the Activity class<br/>
That’s it.<br/>
Example: ```DataBinding2Activity```<br/><br/>  
  
 
4. <h4>Event Handling using data binding</h4>
  Step 1: In layout file, make ```<layout>``` tag as most parent tag or root tag.<br/>
  Step 2: After above step, binding class will be generated based on same name of layout file (e.g. activity_main’s binding class will be generated as ActivityMainBinding). Set setContentView using DataBindingUtil.<br/>
  Step 3:  Create a POJO class i.e. LoginModel and add it as a variable to the layout file.<br/>
  Step 4: Create a presenter class i.e. LoginPresenter and add it as a variable to the layout file.<br/>
  Step 5: ```android:onClick="@{presenter::onClickButton2}"``` is an example of event binding with Method reference
  That’s it.<br/>
  Example: ```MainActivity```<br/><br/>  
  
  
5. <h4>Custom Data Binding Implementation</h4>
  Step 1: In layout file, make ```<layout>``` tag as most parent tag or root tag. Create a POJO class i.e. LoginModel and add it as a variable to the layout file. i.e. LoginModel. Create a presenter class and add it as a variable to the layout file. i.e. LoginPresenter<br/>
  Step 2: Create a separate adapter class for Binding i.e. DataBindingAdapter. Functionality of the custom binding class would be to display a Toast message. Create the binding method inside the customer adapter class.i.e.<br/>     
 ``` @BindingAdapter("toast")
     public static void showToast(View view, String toast) {
        if(toast != null && !toast.isEmpty()) {
            Toast.makeText(view.getContext(), toast, Toast.LENGTH_SHORT).show();
        }
    } 
```
<br/>
Add the custom attribute to your view in the layout file:<br/> 
  
  
6. <h4>Implement RecyclerView using Data Binding</h4>
  Step 1: In layout file, make ```<layout>``` tag as most parent tag or root tag. <br/>
  Step 2: Create a custom ```BindingViewHolder``` class for reusability purposes.<br/>
  Step 3: Create your recyclerview adapter class and item layout class. Set data & variable tag to the layout item class.<br/>
  Step 4: Set ```binding.recyclerView.setAdapter(adapter);``` to the Activity class <br/>
  That’s it.<br/>
  Example: ```DataBinding4Activity```<br/><br/>


