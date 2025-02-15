import com.google.common.util.concurrent.Uninterruptibles;
import extentions.ElectronVerifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import utilities.HackathonListeners;
import workflows.ElectronFlow;

import java.util.concurrent.TimeUnit;

public class ElectronTests extends CommonOps {

  @Test(description = "Change Header Color")
  @Description("This test should should change the color of the app's header and then verify the change")
  public void test01_changeColor() {
    Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
    ElectronFlow.changeHeaderColor("DD22DD");
    ElectronVerifications.verifyHeaderColor("DD22DD");
  }

  @Test(description = "Add ToDo")
  @Description("This test should add a ToDos and verify it was added")
  public void test02_addToDo() {
    ElectronFlow.addToDo("Buy cat food");
    ElectronVerifications.verifyToDoAddition("Buy cat food");
    Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
  }

}
