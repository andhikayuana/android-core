# Android Core Skeleton

Simple and easy to implementation boilerplate Android Project with MVP Architecture, its contains :

1. **BaseActivity**
2. **BaseFragment**
3. **BaseDialogFragment**
4. **BaseRecyclerViewAdapter**
5. **BaseViewHolder**
6. **BasePresenter**
7. **BaseView**

## Installation

Add it in your root build.gradle at the end of repositories:

```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

Add the dependency

```groovy
dependencies {
    compile 'com.github.andhikayuana:android-core:6bc800fa8b'
}
```

## How to use this

1. Fragment

```java
public class LoginFragment extends BaseFragment<LoginPresenter> {

    @Override
    public void showLoading() {
        //do your implementation
    }

    @Override
    public void dismissLoading() {
        //do your implementation
    }

    @Override
    public void showError(Throwable throwable) {
        //do your implementation
    }

    @Override
    protected void initView(View v) {
        //do your implementation
    }

    @Override
    protected LoginPresenter initPresenter() {
        return new LoginPresenter();
    }

    @Override
    protected int setView() {
        return R.layout.fragment_login;
    }
}
```

2. Presenter

```java
public class LoginPresenter extends BasePresenter<LoginView> {
    //do your implementation
}
```

3. View

```java
public interface LoginView extends BaseView {
    //do your implementation
}
```

4. RecyclerViewAdapter

```java
public class ContactsAdapter extends BaseRecyclerViewAdapter<Contact, ContactsViewHolder> {

    public ContactsAdapter(Context context) {
        super(context);
    }

    @Override
    protected ContactsViewHolder initViewHolder(View view) {
        return new ContactsViewHolder(view);
    }

    @Override
    protected int setItemView(int viewType) {
        return R.layout.item_contact;
    }
}
```

Example use in activity

```java
ContactsAdapter adapter = new ContactsAdapter(this);

// now you can use some methods :
adapter.get(1); // to get an item object by position
adapter.add(contact); // to add an item
adapter.indexOf(contact); // to get index of an item
adapter.updateAt(1, contact); // to update item at some index position
adapter.addAll(contacts); // to add item list or array of item
adapter.remove(contact); // to remove an item
adapter.removeItemAt(1); // to remove item at some index
adapter.clear(); // to remove all item
```

5. RecyclerView ViewHolder

```java
public class ContactsViewHolder extends BaseViewHolder<Contact> {

    public ContactsViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void bind(Contact item) {

    }
}
```

## Contributing

1. Fork it!
2. Create your feature branch: `git checkout -b my-new-feature`
3. Commit your changes: `git commit -am 'Add some feature'`
4. Push to the branch: `git push origin my-new-feature`
5. Submit a pull request :D

## License

MIT License

Copyright (c) 2017 Andhika Yuana

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
