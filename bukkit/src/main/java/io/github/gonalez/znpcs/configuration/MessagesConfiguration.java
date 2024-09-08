package io.github.gonalez.znpcs.configuration;

public class MessagesConfiguration extends Configuration {

  @ConfigurationKey(
      name = "NO_PERMISSION",
      description = "Message for no permission")
  public String noPermission = "&cYou do not have permission to execute this command.";

  @ConfigurationKey(
      name = "SUCCESS",
      description = "Message for.success")
  public String success = "&aDone...";

  @ConfigurationKey(
      name = "INCORRECT_USAGE",
      description = "Message for incorrect command usage")
  public String incorrectUsage = "&cIncorrect use of command.";

  @ConfigurationKey(
      name = "COMMAND_NOT_FOUND",
      description = "Message for command not found")
  public String commandNotFound = "&cThis command was not found.";

  @ConfigurationKey(
      name = "COMMAND_ERROR",
      description = "Message for command error")
  public String commandError = "&cThere was an error executing the command, see the console for more information.";

  @ConfigurationKey(
      name = "INVALID_NUMBER",
      description = "Message for invalid number")
  public String invalidNumber = "&cHey!, The inserted number/id does not look like a number..";

  @ConfigurationKey(
      name = "NPC_NOT_FOUND",
      description = "Message for NPC not found")
  public String npcNotFound = "&cHey!, I couldn't find a npc with this id.";

  @ConfigurationKey(
      name = "TOO_FEW_ARGUMENTS",
      description = "Message for too few arguments")
  public String tooFewArguments = "&cToo few arguments.";

  @ConfigurationKey(
      name = "PATH_START",
      description = "Message for path start")
  public String pathStart = "&aDone, now walk where you want the npc to, when u finish type /znpcs path exit.";

  @ConfigurationKey(
      name = "EXIT_PATH",
      description = "Message for exiting path creation")
  public String exitPath = "&cYou have exited the waypoint creation.";

  @ConfigurationKey(
      name = "PATH_FOUND",
      description = "Message for path already exists")
  public String pathFound = "&cThere is already a path with this name.";

  @ConfigurationKey(
      name = "NPC_FOUND",
      description = "Message for NPC already exists")
  public String npcFound = "&cThere is already a npc with this id.";

  @ConfigurationKey(
      name = "NO_PATH_FOUND",
      description = "Message for no path found")
  public String noPathFound = "&cNo path found.";

  @ConfigurationKey(
      name = "NO_SKIN_FOUND",
      description = "Message for no skin found")
  public String noSkinFound = "&cSkin not found.";

  @ConfigurationKey(
      name = "NO_NPC_FOUND",
      description = "Message for no NPC found")
  public String noNpcFound = "&cNo npc found.";

  @ConfigurationKey(
      name = "NO_ACTION_FOUND",
      description = "Message for no action found")
  public String noActionFound = "&cNo action found.";

  @ConfigurationKey(
      name = "NO_LINE_FOUND",
      description = "Message for no line found")
  public String noLineFound = "&cNo line found.";

  @ConfigurationKey(
      name = "METHOD_NOT_FOUND",
      description = "Message for method not found")
  public String methodNotFound = "&cNo method found.";

  @ConfigurationKey(
      name = "INVALID_NAME_LENGTH",
      description = "Message for invalid name length")
  public String invalidNameLength = "&cThe name is too short or long, it must be in the range of (3 to 16) characters.";

  @ConfigurationKey(
      name = "UNSUPPORTED_ENTITY",
      description = "Message for unsupported entity type")
  public String unsupportedEntity = "&cEntity type not available for your current version.";

  @ConfigurationKey(
      name = "PATH_SET_INCORRECT_USAGE",
      description = "Message for incorrect path set usage")
  public String pathSetIncorrectUsage = "&eUsage: &aset <npc_id> <path_name>";

  @ConfigurationKey(
      name = "ACTION_ADD_INCORRECT_USAGE",
      description = "Message for incorrect action add usage")
  public String actionAddIncorrectUsage = "&eUsage: &a<SERVER:CMD:MESSAGE:CONSOLE> <actionValue>";

  @ConfigurationKey(
      name = "ACTION_DELAY_INCORRECT_USAGE",
      description = "Message for incorrect action delay usage")
  public String actionDelayIncorrectUsage = "&eUsage: &a<action_id> <delay>";

  @ConfigurationKey(
      name = "CONVERSATION_SET_INCORRECT_USAGE",
      description = "Message for incorrect conversation set usage")
  public String conversationSetIncorrectUsage = "&cUsage: <npc_id> <conversation_name> <RADIUS:CLICK>";

  @ConfigurationKey(
      name = "NO_CONVERSATION_FOUND",
      description = "Message for no conversation found")
  public String noConversationFound = "&cNo conversation found.";

  @ConfigurationKey(
      name = "CONVERSATION_FOUND",
      description = "Message for conversation already exists")
  public String conversationFound = "&cThere is already a conversation with this name.";

  @ConfigurationKey(
      name = "INVALID_SIZE",
      description = "Message for invalid size")
  public String invalidSize = "&cThe position cannot exceed the limit.";

  @ConfigurationKey(
      name = "FETCHING_SKIN",
      description = "Message for fetching skin")
  public String fetchingSkin = "&aFetching skin for name: &f%s&a, wait...";

  @ConfigurationKey(
      name = "CANT_GET_SKIN",
      description = "Message for can't fetch skin")
  public String cantGetSkin = "&cCan't fetch skin with name: %s.";

  @ConfigurationKey(
      name = "GET_SKIN",
      description = "Message for skin fetched")
  public String getSkin = "&aSkin fetched.";
}