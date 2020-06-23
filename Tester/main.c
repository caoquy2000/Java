//    char str[80];
    //    strcpy(str,"these ");
    //    strcat(str, "strings ");
    //    strcat(str, "are ");
    //    strcat(str, "concatenated. ");
    //    puts(str);
    //    
    //    char mstr[80];
    //    myStrcpy(mstr,"these ");
    //    myStrcat(mstr, "strings ");
    //    myStrcat(mstr, "are ");
    //    myStrcat(mstr, "concatenated. ");
    //    puts(mstr);

    //    char key[] = "apple";
    //    char keyb[] = "";
    //    char keyc[] = "apple";
    //    char keyd[] = "A";
    //    char buffer[80];
    //    char keye[] = "0";
    //    printf("%d\n",strcmp(key,keyb));
    //    printf("%d\n",strcmp(key,keyc));
    //    printf("%d\n",strcmp(key,keyd));
    //    printf("%d\n",strcmp(key,keye));
    //    
    //    printf("%d\n",myStrcmp(key,keyb));
    //    printf("%d\n",myStrcmp(key,keyc));
    //    printf("%d\n",myStrcmp(key,keyd));
    //    printf("%d\n",myStrcmp(key,keye));

    //    char str1[] = "Sample string";
    //    char str2[40];
    //    char str3[40];
    //    strcpy(str2, str1);
    //    strcpy(str3, "copy successful");
    //    printf("str1: %s\nstr2: %s\nstr3: %s\n", str1, str2, str3);
    //
    //    char str4[] = "Sample string";
    //    char str5[40];
    //    char str6[40];
    //    myStrcpy(str5, str4);
    //    myStrcpy(str6, "copy successful");
    //    printf("str1: %s\nstr2: %s\nstr3: %s\n", str4, str5, str6);

    //    char str1[] = "To be or not to be";
    //    char str2[40];
    //    char str3[40];
    //    strncpy(str2,str1, sizeof(str2));
    //    strncpy(str3,str2,5);
    //    str3[5] = '\0';
    //    puts(str1);
    //    puts(str2);
    //    puts(str3);
    //    
    //    char mstr1[] = "To be or not to be";
    //    char mstr2[40];
    //    char mstr3[40];
    //    myStrncpy(mstr2,mstr1, sizeof(mstr2));
    //    myStrncpy(mstr3,mstr2,5);
    //    mstr3[5] = '\0';
    //    puts(mstr1);
    //    puts(mstr2);
    //    puts(mstr3);

    //    char str[] = "This is a simple string";
    //    char * pch;
    //    pch = strstr (str,"simple");
    //    strncpy(pch,"sample",6);
    //    puts(str);
    //    
    //    char mstr[] = "This is a simple string";
    //    char * mpch;
    //    mpch = myStrstr (mstr,"simple");
    //    myStrncpy(mpch,"sample",6);
    //    puts(mstr);

    char str[] = "This is a sample string";
    char * pch;
    printf("Looking for the 's' character in \"%s\"...\n", str);
    pch = strchr(str, 's');
    while (pch != NULL) {
        printf("found at %d\n", pch - str + 1);
        pch = strchr(pch + 1, 's');
    }
    
    char mstr[] = "This is a sample string";
    char * mpch;
    printf("Looking for the 's' character in \"%s\"...\n", mstr);
    mpch = myStrchr(mstr, 's');
    while (mpch != NULL) {
        printf("found at %d\n", mpch - mstr + 1);
        mpch = myStrchr(mpch + 1, 's');
    }
     char firstString[FMAX];
    char secondString[SMAX];
    char RLOC[RMAX];
    char CPP[100];
    char MLOC[MMAX];
    char coppyy[CMAX];
    char ccoppyy[CCMAX];
    int f;
    int s;
    do {
        printf("\nEnter first String: ");
        gets(firstString);
        fflush(stdin);
        printf("\nEnter second String: ");
        gets(secondString);
        fflush(stdin);
        f = strlenn(firstString);
        s = strlenn(secondString);
        printf("\nLength first string: %d", f);
        printf("\nLength second string: %d", s);


        strcatt(firstString, secondString);
        printf("\nString cat: %s\n", firstString);

        int c = strcmpp(firstString, secondString);
        printf("\n Comapare: %d", c);


        strcpyy(coppyy, firstString);
        printf("\nString coppy: %s", coppyy);


        strncpyy(ccoppyy, firstString, 10);
        printf("\nString coppy index: %s ", ccoppyy);



        char *t;
        t = strstrr(firstString, secondString);
        printf("\nString str: %s\n", t);

        char*k;
        char ch = 'o';
        k = strchrr(firstString, ch);
        printf("\n%s", k);

    } while (1);