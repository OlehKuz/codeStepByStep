    

void crawlHelp(string file, string indent){
    cout << indent << getTail(file) << endl;
    if(isDirectory(file)){
        Vector <string> subdir;
        listDirectory(file, subdir);
        // for each directory in our folder, print its subdirectory and its files,
        // making indentation bigger as we get into deeper directory tree
        for(string s : subdir){
                crawlHelp(file + '/' + s, indent + "    ");
        }
    }
}


void crawl(string file){
    crawlHelp(file, "");  
}
