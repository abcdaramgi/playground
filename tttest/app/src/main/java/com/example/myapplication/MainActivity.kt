package com.example.applicationtest

import android.view.MenuItem
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.applicationtest.R.id
import java.util.HashMap
import kotlin.jvm.internal.Intrinsics

@Metadata(
    mv = [1, 7, 1],
    k = 1,
    d1 = ["\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0016"],
    d2 = ["Lcom/example/applicationtest/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/google/android/material/bottomnavigation/BottomNavigationView\$OnNavigationItemSelectedListener;", "()V", "homeScreen", "Lcom/example/applicationtest/HomeScreen;", "mapScreen", "Lcom/example/applicationtest/MapScreen;", "preferScreen", "Lcom/example/applicationtest/PreferScreen;", "searchScreen", "Lcom/example/applicationtest/SearchScreen;", "userScreen", "Lcom/example/applicationtest/UserScreen;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onNavigationItemSelected", "", "item", "Landroid/view/MenuItem;", "Applicationtest.app.main"]
)
class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    private var homeScreen: HomeScreen? = null
    private var searchScreen: SearchScreen? = null
    private var mapScreen: MapScreen? = null
    private var preferScreen: PreferScreen? = null
    private var userScreen: UserScreen? = null
    private var `_$_findViewCache`: HashMap<*, *>? = null
    protected override fun onCreate(savedInstanceState: Bundle?) {
        val mapView = fragment_map_screen(this)
        val mapViewContainer: ViewGroup = findViewById<View>(R.id.map_view) as ViewGroup
        mapViewContainer.addView(fragment_map_screen)
        super.onCreate(savedInstanceState)
        this.setContentView(1300000)
        (`_$_findCachedViewById`(id.nav_view) as BottomNavigationView?).setOnNavigationItemSelectedListener(
            this as BottomNavigationView.OnNavigationItemSelectedListener
        )
        homeScreen = HomeScreen.Companion.newInstance()
        val var10000: FragmentTransaction = this.getSupportFragmentManager().beginTransaction()
        val var10002: HomeScreen? = homeScreen
        if (var10002 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeScreen")
        }
        var10000.add(1000002, (var10002 as Fragment?)!!).commit()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        Intrinsics.checkNotNullParameter(item, "item")
        val var10000: FragmentTransaction
        when (item.itemId) {
            1000003 -> {
                searchScreen = SearchScreen.Companion.newInstance()
                var10000 = this.getSupportFragmentManager().beginTransaction()
                val var5: SearchScreen? = searchScreen
                if (var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchScreen")
                }
                var10000.replace(1000002, (var5 as Fragment?)!!).commit()
            }
            1000004 -> {
                mapScreen = MapScreen.Companion.newInstance()
                var10000 = this.getSupportFragmentManager().beginTransaction()
                val var4: MapScreen? = mapScreen
                if (var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mapScreen")
                }
                var10000.replace(1000002, (var4 as Fragment?)!!).commit()
            }
            1000005 -> {
                preferScreen = PreferScreen.Companion.newInstance()
                var10000 = this.getSupportFragmentManager().beginTransaction()
                val var3: PreferScreen? = preferScreen
                if (var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("preferScreen")
                }
                var10000.replace(1000002, (var3 as Fragment?)!!).commit()
            }
            1000006 -> {
                userScreen = UserScreen.Companion.newInstance()
                var10000 = this.getSupportFragmentManager().beginTransaction()
                val var2: UserScreen? = userScreen
                if (var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userScreen")
                }
                var10000.replace(1000002, (var2 as Fragment?)!!).commit()
            }
            1000007 -> {
                homeScreen = HomeScreen.Companion.newInstance()
                var10000 = this.getSupportFragmentManager().beginTransaction()
                val var10002: HomeScreen? = homeScreen
                if (var10002 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("homeScreen")
                }
                var10000.replace(1000002, (var10002 as Fragment?)!!).commit()
            }
        }
        return true
    }

    fun `_$_findCachedViewById`(var1: Int): View? {
        if (`_$_findViewCache` == null) {
            `_$_findViewCache` = HashMap<Any?, Any?>()
        }
        var var2 = `_$_findViewCache`!![var1] as View?
        if (var2 == null) {
            var2 = this.findViewById<View>(var1)
            `_$_findViewCache`!![var1] = var2!!
        }
        return var2
    }

    fun `_$_clearFindViewByIdCache`() {
        if (`_$_findViewCache` != null) {
            `_$_findViewCache`!!.clear()
        }
    }
}