# Belajar Mengimplementasikan Sebuah Intent

1. Action Check Kata :

```
@Override
    public void onClick(View arg0){
        int startSelection, andSelection;
        if (arg0==button2) {
            startSelection=editT.getSelectionStart();
            andSelection=editT.getSelectionEnd();
            String selectedText = editT.getText().toString().substring(startSelection,andSelection);
            Intent intent=new Intent();
            intent.setAction(ACTION_CHECK);
            intent.putExtra("word",selectedText);
            startActivity(intent);
        }
    }
```

![img](https://github.com/zaenalmusthofa86/IntentCaller/blob/main/img/ActionCheckWord.JPG)

2. Action Check View Website :

```
@Override
    public void onClick(View arg0){
        int startSelection, andSelection;
        if (arg0==button2) {
            String url = "http://www.instagram.com/zae.nall_";
            Intent web = new Intent(Intent.ACTION_VIEW);
            web.setData(Uri.parse(url));
            startActivity(web);
        }
    }
```

![img](https://github.com/zaenalmusthofa86/IntentCaller/blob/main/img/ActionViewWeb.JPG)

3. Action Check View Maps :

```
@Override
    public void onClick(View arg0){
        int startSelection, andSelection;
        if (arg0==button2) {
            Intent intent = new Intent(Intent.ACTION_VIEW,
                   Uri.parse("https://goo.gl/maps/Co1PJoBGiC4gNTf98"));
            startActivity(intent);
        }
    }
```

![img](https://github.com/zaenalmusthofa86/IntentCaller/blob/main/img/ActionViewMaps.JPG)

4. Action Check Dial Calling :

```
@Override
    public void onClick(View arg0){
        int startSelection, andSelection;
        if (arg0==button2) {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:081383306753"));
            startActivity(callIntent);
        }
    }
```

![img](https://github.com/zaenalmusthofa86/IntentCaller/blob/main/img/ActionDialPhone.JPG)