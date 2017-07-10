/*     */ package eu.arrowdev.servers.base;
/*     */ 
/*     */ import eu.arrowdev.servers.layout.Layout;
/*     */ import eu.arrowdev.servers.response.ServerListPing;
/*     */ import eu.arrowdev.servers.response.StatusResponse;
/*     */ import eu.arrowdev.servers.response.StatusResponse.Players;
/*     */ import java.net.InetSocketAddress;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import org.bukkit.inventory.ItemStack;
/*     */ import org.bukkit.inventory.meta.ItemMeta;
/*     */ 
/*     */ public class AServer
/*     */ {
/*     */   private String type;
/*     */   private String ip;
/*     */   private int port;
/*     */   private String motd;
/*     */   private int max;
/*     */   private int online;
/*     */   private ServerListPing serv;
/*     */   private boolean error;
/*     */   private int vipSlots;
/*     */   private Layout fullLayout;
/*     */   private Layout errorLayout;
/*     */   private Layout vipLayout;
/*     */   private Layout joinLayout;
/*     */   private List<String> hideMotd;
/*     */   private boolean hideIfFull;
/*     */   private String bungeeServerName;
/*     */   private ItemStack errorItem;
/*     */   private ItemStack vipItem;
/*     */   private ItemStack joinItem;
/*     */   private ItemStack fullItem;
/*     */   private String permission;
/*     */   private boolean onlineAmount;
/*     */   private boolean allowFullJoin;
/*     */ 
/*     */   public String getType()
/*     */   {
/*  25 */     return this.type;
/*     */   }
/*     */ 
/*     */   public void setType(String type) {
/*  29 */     this.type = type;
/*     */   }
/*     */ 
/*     */   public String getIp() {
/*  33 */     return this.ip;
/*     */   }
/*     */ 
/*     */   public void setIp(String ip) {
/*  37 */     this.ip = ip;
/*     */   }
/*     */ 
/*     */   public int getPort() {
/*  41 */     return this.port;
/*     */   }
/*     */ 
/*     */   public void setPort(int port) {
/*  45 */     this.port = port;
/*     */   }
/*     */ 
/*     */   public String getMotd() {
/*  49 */     return this.motd;
/*     */   }
/*     */ 
/*     */   public void setMotd(String motd) {
/*  53 */     this.motd = motd;
/*     */   }
/*     */ 
/*     */   public int getMax() {
/*  57 */     return this.max;
/*     */   }
/*     */ 
/*     */   public void setMax(int max) {
/*  61 */     this.max = max;
/*     */   }
/*     */ 
/*     */   public int getOnline() {
/*  65 */     return this.online;
/*     */   }
/*     */ 
/*     */   public void setOnline(int online) {
/*  69 */     this.online = online;
/*     */   }
/*     */ 
/*     */   public ServerListPing getServ() {
/*  73 */     return this.serv;
/*     */   }
/*     */ 
/*     */   public void setServ(ServerListPing serv) {
/*  77 */     this.serv = serv;
/*     */   }
/*     */ 
/*     */   public boolean isError() {
/*  81 */     return this.error;
/*     */   }
/*     */ 
/*     */   public void setError(boolean error) {
/*  85 */     this.error = error;
/*     */   }
/*     */ 
/*     */   public int getVipSlots() {
/*  89 */     return this.vipSlots;
/*     */   }
/*     */ 
/*     */   public void setVipSlots(int vipSlots) {
/*  93 */     this.vipSlots = vipSlots;
/*     */   }
/*     */ 
/*     */   public Layout getFullLayout() {
/*  97 */     return this.fullLayout;
/*     */   }
/*     */ 
/*     */   public void setFullLayout(Layout fullLayout) {
/* 101 */     this.fullLayout = fullLayout;
/*     */   }
/*     */ 
/*     */   public Layout getErrorLayout() {
/* 105 */     return this.errorLayout;
/*     */   }
/*     */ 
/*     */   public void setErrorLayout(Layout errorLayout) {
/* 109 */     this.errorLayout = errorLayout;
/*     */   }
/*     */ 
/*     */   public Layout getVipLayout() {
/* 113 */     return this.vipLayout;
/*     */   }
/*     */ 
/*     */   public void setVipLayout(Layout vipLayout) {
/* 117 */     this.vipLayout = vipLayout;
/*     */   }
/*     */ 
/*     */   public Layout getJoinLayout() {
/* 121 */     return this.joinLayout;
/*     */   }
/*     */ 
/*     */   public void setJoinLayout(Layout joinLayout) {
/* 125 */     this.joinLayout = joinLayout;
/*     */   }
/*     */ 
/*     */   public List<String> getHideMotd() {
/* 129 */     return this.hideMotd;
/*     */   }
/*     */ 
/*     */   public void setHideMotd(List<String> hideMotd) {
/* 133 */     this.hideMotd = hideMotd;
/*     */   }
/*     */ 
/*     */   public boolean isHideIfFull() {
/* 137 */     return this.hideIfFull;
/*     */   }
/*     */ 
/*     */   public void setHideIfFull(boolean hideIfFull) {
/* 141 */     this.hideIfFull = hideIfFull;
/*     */   }
/*     */ 
/*     */   public String getBungeeServerName() {
/* 145 */     return this.bungeeServerName;
/*     */   }
/*     */ 
/*     */   public void setBungeeServerName(String bungeeServerName) {
/* 149 */     this.bungeeServerName = bungeeServerName;
/*     */   }
/*     */ 
/*     */   public ItemStack getErrorItem() {
/* 153 */     return this.errorItem;
/*     */   }
/*     */ 
/*     */   public void setErrorItem(ItemStack errorItem) {
/* 157 */     this.errorItem = errorItem;
/*     */   }
/*     */ 
/*     */   public ItemStack getVipItem() {
/* 161 */     return this.vipItem;
/*     */   }
/*     */ 
/*     */   public void setVipItem(ItemStack vipItem) {
/* 165 */     this.vipItem = vipItem;
/*     */   }
/*     */ 
/*     */   public ItemStack getJoinItem() {
/* 169 */     return this.joinItem;
/*     */   }
/*     */ 
/*     */   public void setJoinItem(ItemStack joinItem) {
/* 173 */     this.joinItem = joinItem;
/*     */   }
/*     */ 
/*     */   public ItemStack getFullItem() {
/* 177 */     return this.fullItem;
/*     */   }
/*     */ 
/*     */   public void setFullItem(ItemStack fullItem) {
/* 181 */     this.fullItem = fullItem;
/*     */   }
/*     */ 
/*     */   public String getPermission() {
/* 185 */     return this.permission;
/*     */   }
/*     */ 
/*     */   public void setPermission(String permission) {
/* 189 */     this.permission = permission;
/*     */   }
/*     */ 
/*     */   public boolean isOnlineAmount() {
/* 193 */     return this.onlineAmount;
/*     */   }
/*     */ 
/*     */   public void setOnlineAmount(boolean onlineAmount) {
/* 197 */     this.onlineAmount = onlineAmount;
/*     */   }
/*     */ 
/*     */   public boolean isAllowFullJoin() {
/* 201 */     return this.allowFullJoin;
/*     */   }
/*     */ 
/*     */   public void setAllowFullJoin(boolean allowFullJoin) {
/* 205 */     this.allowFullJoin = allowFullJoin;
/*     */   }
/*     */ 
/*     */   public ItemStack getItem()
/*     */   {
/* 251 */     ItemStack cur = this.joinItem;
/*     */ 
/* 253 */     ItemMeta im = cur.getItemMeta();
/*     */ 
/* 255 */     List l = new ArrayList();
/*     */ 
/* 257 */     for (int i = 0; i < this.joinLayout.getLines().size(); i++) {
/* 258 */       l.add(this.joinLayout.getColoredLine(i).replace("{ONLINE}", this.online).replace("{MAX}", this.max).replace("{MOTD}", this.motd));
/*     */     }
/*     */ 
/* 261 */     im.setLore(l);
/* 262 */     im.setDisplayName(this.joinLayout.getColoredName());
/*     */ 
/* 264 */     cur.setItemMeta(im);
/*     */ 
/* 266 */     if (this.online + this.vipSlots >= this.max) {
/* 267 */       cur = this.vipItem;
/*     */ 
/* 269 */       im = cur.getItemMeta();
/*     */ 
/* 271 */       l = new ArrayList();
/*     */ 
/* 273 */       for (int i = 0; i < this.vipLayout.getLines().size(); i++) {
/* 274 */         l.add(this.vipLayout.getColoredLine(i).replace("{ONLINE}", this.online).replace("{MAX}", this.max).replace("{MOTD}", this.motd));
/*     */       }
/*     */ 
/* 277 */       im.setLore(l);
/* 278 */       im.setDisplayName(this.vipLayout.getColoredName());
/*     */ 
/* 280 */       cur.setItemMeta(im);
/*     */     }
/* 282 */     if (this.online == this.max) {
/* 283 */       cur = this.fullItem;
/*     */ 
/* 285 */       im = cur.getItemMeta();
/*     */ 
/* 287 */       l = new ArrayList();
/*     */ 
/* 289 */       for (int i = 0; i < this.fullLayout.getLines().size(); i++) {
/* 290 */         l.add(this.fullLayout.getColoredLine(i).replace("{ONLINE}", this.online).replace("{MAX}", this.max).replace("{MOTD}", this.motd));
/*     */       }
/*     */ 
/* 293 */       im.setLore(l);
/* 294 */       im.setDisplayName(this.fullLayout.getColoredName());
/*     */ 
/* 296 */       cur.setItemMeta(im);
/*     */     }
/* 298 */     if (this.error) {
/* 299 */       cur = this.errorItem;
/*     */ 
/* 301 */       im = cur.getItemMeta();
/*     */ 
/* 303 */       l = new ArrayList();
/*     */ 
/* 305 */       for (int i = 0; i < this.errorLayout.getLines().size(); i++) {
/* 306 */         l.add(this.errorLayout.getColoredLine(i).replace("{ONLINE}", this.online).replace("{MAX}", this.max).replace("{MOTD}", this.motd));
/*     */       }
/*     */ 
/* 309 */       im.setLore(l);
/* 310 */       im.setDisplayName(this.errorLayout.getColoredName());
/*     */ 
/* 312 */       cur.setItemMeta(im);
/*     */     }
/* 314 */     if (this.onlineAmount) {
/* 315 */       cur.setAmount(this.online);
/*     */     }
/* 317 */     return cur;
/*     */   }
/*     */ 
/*     */   public synchronized void update() {
/*     */     try {
/* 322 */       StatusResponse res = this.serv.fetchData();
/* 323 */       this.online = res.getPlayers().getOnline();
/* 324 */       this.max = res.getPlayers().getMax();
/* 325 */       this.motd = res.getDescription();
/* 326 */       this.error = false;
/*     */     } catch (Exception e) {
/* 328 */       this.online = 0;
/* 329 */       this.max = 0;
/* 330 */       this.motd = "Unknown";
/* 331 */       this.error = true;
/*     */     }
/*     */   }
/*     */ 
/*     */   public AServer(String type, String ip, int port, int vipSlots, ItemStack errorItem, ItemStack vipItem, ItemStack joinItem, ItemStack fullItem, String permission, boolean onlineAmount, List<String> hidemotd, Layout joinLayout, Layout errorLayout, Layout vipLayout, Layout fullLayout, boolean hideIfFull, boolean allowFullJoin, String bng)
/*     */   {
/* 340 */     this.hideMotd = hidemotd;
/* 341 */     this.onlineAmount = onlineAmount;
/* 342 */     this.type = type;
/* 343 */     this.ip = ip;
/*     */ 
/* 345 */     this.allowFullJoin = allowFullJoin;
/* 346 */     this.port = port;
/* 347 */     this.vipSlots = vipSlots;
/* 348 */     this.joinLayout = joinLayout;
/* 349 */     this.errorLayout = errorLayout;
/* 350 */     this.fullLayout = fullLayout;
/* 351 */     this.vipLayout = vipLayout;
/* 352 */     this.errorItem = errorItem;
/* 353 */     this.hideIfFull = hideIfFull;
/* 354 */     this.vipItem = vipItem;
/* 355 */     this.joinItem = joinItem;
/* 356 */     this.fullItem = fullItem;
/* 357 */     this.permission = permission;
/* 358 */     this.bungeeServerName = bng;
/* 359 */     this.serv = new ServerListPing();
/* 360 */     this.serv.host = new InetSocketAddress(ip, port);
/*     */   }
/*     */ }

/* Location:           C:\Users\intot\Downloads\ServerSelector (1).jar
 * Qualified Name:     eu.arrowdev.servers.base.AServer
 * JD-Core Version:    0.6.2
 */