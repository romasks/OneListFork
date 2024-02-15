package com.lolo.io.onelist.core.data.di

//val appModule = module {
//
//    single {
//        SharedPreferencesHelper(get())
//    }
//
//    single<OneListDatabase> {
//        Room.databaseBuilder(
//            get(),
//            OneListDatabase::class.java,
//            "onelist.db"
//        ).build()
//    }
//
//    single {
//        OneListUseCases(
//            createList = CreateList(get()),
//            getAllLists = GetAllLists(
//                (get())
//            ),
//            removeList = RemoveList((get())),
//            handleFirstLaunch = HandleFirstLaunch(get(), get()),
//            editList = EditList(get()),
//            importList = ImportList(get()),
//            moveList = MoveList(get()),
//            setBackupUri = SetBackupUri(get()),
//            syncAllLists = SyncAllLists(get()),
//            showWhatsNew = ShowWhatsNew(get())
//        )
//    }
//
//    single {
//        OneListRepository(get(), get(), get())
//    }
//
//    single {
//        FileAccess(get())
//    }
//
//    single<ItemListDao> {
//        val database = get<OneListDatabase>()
//        database.itemListDao
//    }
//
//}

