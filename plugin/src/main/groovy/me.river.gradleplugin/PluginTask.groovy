import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

/**
 * Created by River on 16/2/27.
 */
class PluginTask extends DefaultTask {

    @TaskAction
    def pluginStart(){
        println('This is a plugin task')
    }
}