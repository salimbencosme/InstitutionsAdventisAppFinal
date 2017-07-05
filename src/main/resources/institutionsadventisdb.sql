/*
Navicat MySQL Data Transfer

Source Server         : localdatabases
Source Server Version : 50623
Source Host           : 127.0.0.1:3306
Source Database       : institutionsadventisdb

Target Server Type    : MYSQL
Target Server Version : 50623
File Encoding         : 65001

Date: 2017-07-05 07:30:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for associationormission
-- ----------------------------
DROP TABLE IF EXISTS `associationormission`;
CREATE TABLE `associationormission` (
  `idassociationormission` int(11) NOT NULL AUTO_INCREMENT,
  `active` tinyint(4) NOT NULL,
  `name` varchar(300) NOT NULL,
  `type` bit(1) NOT NULL,
  `idunion` int(11) NOT NULL,
  PRIMARY KEY (`idassociationormission`),
  KEY `FKpu74mfwcaa1ip27xg7uwyrrna` (`idunion`),
  CONSTRAINT `FKpu74mfwcaa1ip27xg7uwyrrna` FOREIGN KEY (`idunion`) REFERENCES `union` (`idunion`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of associationormission
-- ----------------------------
INSERT INTO `associationormission` VALUES ('1', '1', 'Asociación Dominicana del Sureste (ADOSE)', '', '1');

-- ----------------------------
-- Table structure for country
-- ----------------------------
DROP TABLE IF EXISTS `country`;
CREATE TABLE `country` (
  `idcountry` int(11) NOT NULL AUTO_INCREMENT,
  `country` varchar(300) NOT NULL,
  PRIMARY KEY (`idcountry`)
) ENGINE=InnoDB AUTO_INCREMENT=262 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of country
-- ----------------------------
INSERT INTO `country` VALUES ('1', 'Afganistán');
INSERT INTO `country` VALUES ('2', 'Akrotiri');
INSERT INTO `country` VALUES ('3', 'Albania');
INSERT INTO `country` VALUES ('4', 'Alemania');
INSERT INTO `country` VALUES ('5', 'Andorra');
INSERT INTO `country` VALUES ('6', 'Angola');
INSERT INTO `country` VALUES ('7', 'Anguila');
INSERT INTO `country` VALUES ('8', 'Antártida');
INSERT INTO `country` VALUES ('9', 'Antigua y Barbuda');
INSERT INTO `country` VALUES ('10', 'Antillas Neerlandesas');
INSERT INTO `country` VALUES ('11', 'Arabia Saudí');
INSERT INTO `country` VALUES ('12', 'Arctic Ocean');
INSERT INTO `country` VALUES ('13', 'Argelia');
INSERT INTO `country` VALUES ('14', 'Argentina');
INSERT INTO `country` VALUES ('15', 'Armenia');
INSERT INTO `country` VALUES ('16', 'Aruba');
INSERT INTO `country` VALUES ('17', 'Ashmore and Cartier Islands');
INSERT INTO `country` VALUES ('18', 'Atlantic Ocean');
INSERT INTO `country` VALUES ('19', 'Australia');
INSERT INTO `country` VALUES ('20', 'Austria');
INSERT INTO `country` VALUES ('21', 'Azerbaiyán');
INSERT INTO `country` VALUES ('22', 'Bahamas');
INSERT INTO `country` VALUES ('23', 'Bahráin');
INSERT INTO `country` VALUES ('24', 'Bangladesh');
INSERT INTO `country` VALUES ('25', 'Barbados');
INSERT INTO `country` VALUES ('26', 'Bélgica');
INSERT INTO `country` VALUES ('27', 'Belice');
INSERT INTO `country` VALUES ('28', 'Benín');
INSERT INTO `country` VALUES ('29', 'Bermudas');
INSERT INTO `country` VALUES ('30', 'Bielorrusia');
INSERT INTO `country` VALUES ('31', 'Birmania; Myanmar');
INSERT INTO `country` VALUES ('32', 'Bolivia');
INSERT INTO `country` VALUES ('33', 'Bosnia y Hercegovina');
INSERT INTO `country` VALUES ('34', 'Botsuana');
INSERT INTO `country` VALUES ('35', 'Brasil');
INSERT INTO `country` VALUES ('36', 'Brunéi');
INSERT INTO `country` VALUES ('37', 'Bulgaria');
INSERT INTO `country` VALUES ('38', 'Burkina Faso');
INSERT INTO `country` VALUES ('39', 'Burundi');
INSERT INTO `country` VALUES ('40', 'Bután');
INSERT INTO `country` VALUES ('41', 'Cabo Verde');
INSERT INTO `country` VALUES ('42', 'Camboya');
INSERT INTO `country` VALUES ('43', 'Camerún');
INSERT INTO `country` VALUES ('44', 'Canadá');
INSERT INTO `country` VALUES ('45', 'Chad');
INSERT INTO `country` VALUES ('46', 'Chile');
INSERT INTO `country` VALUES ('47', 'China');
INSERT INTO `country` VALUES ('48', 'Chipre');
INSERT INTO `country` VALUES ('49', 'Clipperton Island');
INSERT INTO `country` VALUES ('50', 'Colombia');
INSERT INTO `country` VALUES ('51', 'Comoras');
INSERT INTO `country` VALUES ('52', 'Congo');
INSERT INTO `country` VALUES ('53', 'Coral Sea Islands');
INSERT INTO `country` VALUES ('54', 'Corea del Norte');
INSERT INTO `country` VALUES ('55', 'Corea del Sur');
INSERT INTO `country` VALUES ('56', 'Costa de Marfil');
INSERT INTO `country` VALUES ('57', 'Costa Rica');
INSERT INTO `country` VALUES ('58', 'Croacia');
INSERT INTO `country` VALUES ('59', 'Cuba');
INSERT INTO `country` VALUES ('60', 'Dhekelia');
INSERT INTO `country` VALUES ('61', 'Dinamarca');
INSERT INTO `country` VALUES ('62', 'Dominica');
INSERT INTO `country` VALUES ('63', 'Ecuador');
INSERT INTO `country` VALUES ('64', 'Egipto');
INSERT INTO `country` VALUES ('65', 'El Salvador');
INSERT INTO `country` VALUES ('66', 'El Vaticano');
INSERT INTO `country` VALUES ('67', 'Emiratos Árabes Unidos');
INSERT INTO `country` VALUES ('68', 'Eritrea');
INSERT INTO `country` VALUES ('69', 'Eslovaquia');
INSERT INTO `country` VALUES ('70', 'Eslovenia');
INSERT INTO `country` VALUES ('71', 'España');
INSERT INTO `country` VALUES ('72', 'Estados Unidos');
INSERT INTO `country` VALUES ('73', 'Estonia');
INSERT INTO `country` VALUES ('74', 'Etiopía');
INSERT INTO `country` VALUES ('75', 'Filipinas');
INSERT INTO `country` VALUES ('76', 'Finlandia');
INSERT INTO `country` VALUES ('77', 'Fiyi');
INSERT INTO `country` VALUES ('78', 'Francia');
INSERT INTO `country` VALUES ('79', 'Gabón');
INSERT INTO `country` VALUES ('80', 'Gambia');
INSERT INTO `country` VALUES ('81', 'Gaza Strip');
INSERT INTO `country` VALUES ('82', 'Georgia');
INSERT INTO `country` VALUES ('83', 'Ghana');
INSERT INTO `country` VALUES ('84', 'Gibraltar');
INSERT INTO `country` VALUES ('85', 'Granada');
INSERT INTO `country` VALUES ('86', 'Grecia');
INSERT INTO `country` VALUES ('87', 'Groenlandia');
INSERT INTO `country` VALUES ('88', 'Guam');
INSERT INTO `country` VALUES ('89', 'Guatemala');
INSERT INTO `country` VALUES ('90', 'Guernsey');
INSERT INTO `country` VALUES ('91', 'Guinea');
INSERT INTO `country` VALUES ('92', 'Guinea Ecuatorial');
INSERT INTO `country` VALUES ('93', 'Guinea-Bissau');
INSERT INTO `country` VALUES ('94', 'Guyana');
INSERT INTO `country` VALUES ('95', 'Haití');
INSERT INTO `country` VALUES ('96', 'Honduras');
INSERT INTO `country` VALUES ('97', 'Hong Kong');
INSERT INTO `country` VALUES ('98', 'Hungría');
INSERT INTO `country` VALUES ('99', 'India');
INSERT INTO `country` VALUES ('100', 'Indian Ocean');
INSERT INTO `country` VALUES ('101', 'Indonesia');
INSERT INTO `country` VALUES ('102', 'Irán');
INSERT INTO `country` VALUES ('103', 'Iraq');
INSERT INTO `country` VALUES ('104', 'Irlanda');
INSERT INTO `country` VALUES ('105', 'Isla Bouvet');
INSERT INTO `country` VALUES ('106', 'Isla Christmas');
INSERT INTO `country` VALUES ('107', 'Isla Norfolk');
INSERT INTO `country` VALUES ('108', 'Islandia');
INSERT INTO `country` VALUES ('109', 'Islas Caimán');
INSERT INTO `country` VALUES ('110', 'Islas Cocos');
INSERT INTO `country` VALUES ('111', 'Islas Cook');
INSERT INTO `country` VALUES ('112', 'Islas Feroe');
INSERT INTO `country` VALUES ('113', 'Islas Georgia del Sur y Sandwich del Sur');
INSERT INTO `country` VALUES ('114', 'Islas Heard y McDonald');
INSERT INTO `country` VALUES ('115', 'Islas Malvinas');
INSERT INTO `country` VALUES ('116', 'Islas Marianas del Norte');
INSERT INTO `country` VALUES ('117', 'Islas Marshall');
INSERT INTO `country` VALUES ('118', 'Islas Pitcairn');
INSERT INTO `country` VALUES ('119', 'Islas Salomón');
INSERT INTO `country` VALUES ('120', 'Islas Turcas y Caicos');
INSERT INTO `country` VALUES ('121', 'Islas Vírgenes Americanas');
INSERT INTO `country` VALUES ('122', 'Islas Vírgenes Británicas');
INSERT INTO `country` VALUES ('123', 'Israel');
INSERT INTO `country` VALUES ('124', 'Italia');
INSERT INTO `country` VALUES ('125', 'Jamaica');
INSERT INTO `country` VALUES ('126', 'Jan Mayen');
INSERT INTO `country` VALUES ('127', 'Japón');
INSERT INTO `country` VALUES ('128', 'Jersey');
INSERT INTO `country` VALUES ('129', 'Jordania');
INSERT INTO `country` VALUES ('130', 'Kazajistán');
INSERT INTO `country` VALUES ('131', 'Kenia');
INSERT INTO `country` VALUES ('132', 'Kirguizistán');
INSERT INTO `country` VALUES ('133', 'Kiribati');
INSERT INTO `country` VALUES ('134', 'Kuwait');
INSERT INTO `country` VALUES ('135', 'Laos');
INSERT INTO `country` VALUES ('136', 'Lesoto');
INSERT INTO `country` VALUES ('137', 'Letonia');
INSERT INTO `country` VALUES ('138', 'Líbano');
INSERT INTO `country` VALUES ('139', 'Liberia');
INSERT INTO `country` VALUES ('140', 'Libia');
INSERT INTO `country` VALUES ('141', 'Liechtenstein');
INSERT INTO `country` VALUES ('142', 'Lituania');
INSERT INTO `country` VALUES ('143', 'Luxemburgo');
INSERT INTO `country` VALUES ('144', 'Macao');
INSERT INTO `country` VALUES ('145', 'Macedonia');
INSERT INTO `country` VALUES ('146', 'Madagascar');
INSERT INTO `country` VALUES ('147', 'Malasia');
INSERT INTO `country` VALUES ('148', 'Malaui');
INSERT INTO `country` VALUES ('149', 'Maldivas');
INSERT INTO `country` VALUES ('150', 'Malí');
INSERT INTO `country` VALUES ('151', 'Malta');
INSERT INTO `country` VALUES ('152', 'Man, Isle of');
INSERT INTO `country` VALUES ('153', 'Marruecos');
INSERT INTO `country` VALUES ('154', 'Mauricio');
INSERT INTO `country` VALUES ('155', 'Mauritania');
INSERT INTO `country` VALUES ('156', 'Mayotte');
INSERT INTO `country` VALUES ('157', 'México');
INSERT INTO `country` VALUES ('158', 'Micronesia');
INSERT INTO `country` VALUES ('159', 'Moldavia');
INSERT INTO `country` VALUES ('160', 'Mónaco');
INSERT INTO `country` VALUES ('161', 'Mongolia');
INSERT INTO `country` VALUES ('162', 'Montenegro');
INSERT INTO `country` VALUES ('163', 'Montserrat');
INSERT INTO `country` VALUES ('164', 'Mozambique');
INSERT INTO `country` VALUES ('165', 'Mundo');
INSERT INTO `country` VALUES ('166', 'Namibia');
INSERT INTO `country` VALUES ('167', 'Nauru');
INSERT INTO `country` VALUES ('168', 'Navassa Island');
INSERT INTO `country` VALUES ('169', 'Nepal');
INSERT INTO `country` VALUES ('170', 'Nicaragua');
INSERT INTO `country` VALUES ('171', 'Níger');
INSERT INTO `country` VALUES ('172', 'Nigeria');
INSERT INTO `country` VALUES ('173', 'Niue');
INSERT INTO `country` VALUES ('174', 'Noruega');
INSERT INTO `country` VALUES ('175', 'Nueva Caledonia');
INSERT INTO `country` VALUES ('176', 'Nueva Zelanda');
INSERT INTO `country` VALUES ('177', 'Omán');
INSERT INTO `country` VALUES ('178', 'Pacific Ocean');
INSERT INTO `country` VALUES ('179', 'Países Bajos');
INSERT INTO `country` VALUES ('180', 'Pakistán');
INSERT INTO `country` VALUES ('181', 'Palaos');
INSERT INTO `country` VALUES ('182', 'Panamá');
INSERT INTO `country` VALUES ('183', 'Papúa-Nueva Guinea');
INSERT INTO `country` VALUES ('184', 'Paracel Islands');
INSERT INTO `country` VALUES ('185', 'Paraguay');
INSERT INTO `country` VALUES ('186', 'Perú');
INSERT INTO `country` VALUES ('187', 'Polinesia Francesa');
INSERT INTO `country` VALUES ('188', 'Polonia');
INSERT INTO `country` VALUES ('189', 'Portugal');
INSERT INTO `country` VALUES ('190', 'Puerto Rico');
INSERT INTO `country` VALUES ('191', 'Qatar');
INSERT INTO `country` VALUES ('192', 'Reino Unido');
INSERT INTO `country` VALUES ('193', 'República Centroafricana');
INSERT INTO `country` VALUES ('194', 'República Checa');
INSERT INTO `country` VALUES ('195', 'República Democrática del Congo');
INSERT INTO `country` VALUES ('196', 'República Dominicana');
INSERT INTO `country` VALUES ('197', 'Ruanda');
INSERT INTO `country` VALUES ('198', 'Rumania');
INSERT INTO `country` VALUES ('199', 'Rusia');
INSERT INTO `country` VALUES ('200', 'Sáhara Occidental');
INSERT INTO `country` VALUES ('201', 'Samoa');
INSERT INTO `country` VALUES ('202', 'Samoa Americana');
INSERT INTO `country` VALUES ('203', 'San Cristóbal y Nieves');
INSERT INTO `country` VALUES ('204', 'San Marino');
INSERT INTO `country` VALUES ('205', 'San Pedro y Miquelón');
INSERT INTO `country` VALUES ('206', 'San Vicente y las Granadinas');
INSERT INTO `country` VALUES ('207', 'Santa Helena');
INSERT INTO `country` VALUES ('208', 'Santa Lucía');
INSERT INTO `country` VALUES ('209', 'Santo Tomé y Príncipe');
INSERT INTO `country` VALUES ('210', 'Senegal');
INSERT INTO `country` VALUES ('211', 'Serbia');
INSERT INTO `country` VALUES ('212', 'Seychelles');
INSERT INTO `country` VALUES ('213', 'Sierra Leona');
INSERT INTO `country` VALUES ('214', 'Singapur');
INSERT INTO `country` VALUES ('215', 'Siria');
INSERT INTO `country` VALUES ('216', 'Somalia');
INSERT INTO `country` VALUES ('217', 'Southern Ocean');
INSERT INTO `country` VALUES ('218', 'Spratly Islands');
INSERT INTO `country` VALUES ('219', 'Sri Lanka');
INSERT INTO `country` VALUES ('220', 'Suazilandia');
INSERT INTO `country` VALUES ('221', 'Sudáfrica');
INSERT INTO `country` VALUES ('222', 'Sudán');
INSERT INTO `country` VALUES ('223', 'Suecia');
INSERT INTO `country` VALUES ('224', 'Suiza');
INSERT INTO `country` VALUES ('225', 'Surinam');
INSERT INTO `country` VALUES ('226', 'Svalbard y Jan Mayen');
INSERT INTO `country` VALUES ('227', 'Tailandia');
INSERT INTO `country` VALUES ('228', 'Taiwán');
INSERT INTO `country` VALUES ('229', 'Tanzania');
INSERT INTO `country` VALUES ('230', 'Tayikistán');
INSERT INTO `country` VALUES ('231', 'Territorio Británico del Océano Indico');
INSERT INTO `country` VALUES ('232', 'Territorios Australes Franceses');
INSERT INTO `country` VALUES ('233', 'Timor Oriental');
INSERT INTO `country` VALUES ('234', 'Togo');
INSERT INTO `country` VALUES ('235', 'Tokelau');
INSERT INTO `country` VALUES ('236', 'Tonga');
INSERT INTO `country` VALUES ('237', 'Trinidad y Tobago');
INSERT INTO `country` VALUES ('238', 'Túnez');
INSERT INTO `country` VALUES ('239', 'Turkmenistán');
INSERT INTO `country` VALUES ('240', 'Turquía');
INSERT INTO `country` VALUES ('241', 'Tuvalu');
INSERT INTO `country` VALUES ('242', 'Ucrania');
INSERT INTO `country` VALUES ('243', 'Uganda');
INSERT INTO `country` VALUES ('244', 'Unión Europea');
INSERT INTO `country` VALUES ('245', 'Uruguay');
INSERT INTO `country` VALUES ('246', 'Uzbekistán');
INSERT INTO `country` VALUES ('247', 'Vanuatu');
INSERT INTO `country` VALUES ('248', 'Venezuela');
INSERT INTO `country` VALUES ('249', 'Vietnam');
INSERT INTO `country` VALUES ('250', 'Wake Island');
INSERT INTO `country` VALUES ('251', 'Wallis y Futuna');
INSERT INTO `country` VALUES ('252', 'West Bank');
INSERT INTO `country` VALUES ('253', 'Yemen');
INSERT INTO `country` VALUES ('254', 'Yibuti');
INSERT INTO `country` VALUES ('255', 'Zambia');
INSERT INTO `country` VALUES ('256', 'Zimbabue');

-- ----------------------------
-- Table structure for district
-- ----------------------------
DROP TABLE IF EXISTS `district`;
CREATE TABLE `district` (
  `iddistrict` int(11) NOT NULL AUTO_INCREMENT,
  `active` bit(1) NOT NULL,
  `district` varchar(300) NOT NULL,
  `zone` int(11) NOT NULL,
  `idassociationormission` int(11) NOT NULL,
  PRIMARY KEY (`iddistrict`),
  KEY `FKjw6ussabgirbqcyebte1uldxb` (`idassociationormission`),
  CONSTRAINT `FKjw6ussabgirbqcyebte1uldxb` FOREIGN KEY (`idassociationormission`) REFERENCES `associationormission` (`idassociationormission`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of district
-- ----------------------------
INSERT INTO `district` VALUES ('1', '', 'Las Campanas', '3', '1');
INSERT INTO `district` VALUES ('4', '', 'Villa faro', '1', '1');

-- ----------------------------
-- Table structure for institutions
-- ----------------------------
DROP TABLE IF EXISTS `institutions`;
CREATE TABLE `institutions` (
  `idinstitutions` int(11) NOT NULL AUTO_INCREMENT,
  `active` bit(1) NOT NULL,
  `address` varchar(500) NOT NULL,
  `contactinformation` text,
  `latitude` varchar(200) NOT NULL,
  `longitude` varchar(200) NOT NULL,
  `name` varchar(300) NOT NULL,
  `iddistrict` int(11) NOT NULL,
  `idtypeinstitutions` int(11) NOT NULL,
  PRIMARY KEY (`idinstitutions`),
  KEY `FKg428t5m1ewy0ie7k4ps7t13hl` (`iddistrict`),
  KEY `FKrw86kebhafawicw6v3yb05dkq` (`idtypeinstitutions`),
  CONSTRAINT `FKg428t5m1ewy0ie7k4ps7t13hl` FOREIGN KEY (`iddistrict`) REFERENCES `district` (`iddistrict`),
  CONSTRAINT `FKrw86kebhafawicw6v3yb05dkq` FOREIGN KEY (`idtypeinstitutions`) REFERENCES `typeinstitutions` (`idtypeinstitutions`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of institutions
-- ----------------------------
INSERT INTO `institutions` VALUES ('1', '', 'Calle Primavera, Santo Domingo Este', 'ok', '18.496350', '-69.831615', 'Campana II', '1', '3');
INSERT INTO `institutions` VALUES ('2', '', 'Manzana 3614 Santo Domingo Este', '-', '18.486190', '-69.827114', 'Central Franconia', '1', '1');
INSERT INTO `institutions` VALUES ('3', '', '-', '-', '18.481723', '-69.829244', 'Valle del Señor', '1', '4');
INSERT INTO `institutions` VALUES ('4', '', '-', '-', '18.489223', '-69.862976', 'Alma Rosa I', '1', '1');
INSERT INTO `institutions` VALUES ('5', '', '-', '-', '18.491446', '-69.869399', 'Ozama', '1', '1');
INSERT INTO `institutions` VALUES ('6', '', '-', '-', '18.474457', '-69.861829', 'El Edén', '1', '2');
INSERT INTO `institutions` VALUES ('7', '', '-', '-', '18.492248', '-69.871072', 'ADOSE', '1', '1');
INSERT INTO `institutions` VALUES ('8', '', '-', '-', '18.50262', '-69.796352', 'Ultimo Pregon', '1', '1');
INSERT INTO `institutions` VALUES ('9', '', '-', '-', '18.507997', '-69.864705', 'Los Mina', '1', '3');
INSERT INTO `institutions` VALUES ('10', '', '-', '-', '18.535963', '-69.898668', 'Espada Encendida', '1', '1');
INSERT INTO `institutions` VALUES ('11', '', '-', '-', '18.468253', '-69.825636', 'Corales del Sur', '1', '4');
INSERT INTO `institutions` VALUES ('12', '', 'Urb. Italia', '809-597-7195', '18.522346', '-69.841731', 'Prados del Señor', '1', '5');

-- ----------------------------
-- Table structure for typeinstitutions
-- ----------------------------
DROP TABLE IF EXISTS `typeinstitutions`;
CREATE TABLE `typeinstitutions` (
  `idtypeinstitutions` int(11) NOT NULL AUTO_INCREMENT,
  `active` bit(1) NOT NULL,
  `typename` varchar(300) NOT NULL,
  PRIMARY KEY (`idtypeinstitutions`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of typeinstitutions
-- ----------------------------
INSERT INTO `typeinstitutions` VALUES ('1', '', 'Chursh');
INSERT INTO `typeinstitutions` VALUES ('2', '', 'School');
INSERT INTO `typeinstitutions` VALUES ('3', '', 'University');
INSERT INTO `typeinstitutions` VALUES ('4', '', 'Hospital');
INSERT INTO `typeinstitutions` VALUES ('5', '', 'Restaurant');

-- ----------------------------
-- Table structure for union
-- ----------------------------
DROP TABLE IF EXISTS `union`;
CREATE TABLE `union` (
  `idunion` int(11) NOT NULL AUTO_INCREMENT,
  `active` bit(1) NOT NULL,
  `unionname` varchar(400) NOT NULL,
  `idcountry` int(11) NOT NULL,
  PRIMARY KEY (`idunion`),
  KEY `FKcwsop2v76ykdqkh83kdw5cn6j` (`idcountry`),
  CONSTRAINT `FKcwsop2v76ykdqkh83kdw5cn6j` FOREIGN KEY (`idcountry`) REFERENCES `country` (`idcountry`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of union
-- ----------------------------
INSERT INTO `union` VALUES ('1', '', 'Unión Dominicana', '196');
INSERT INTO `union` VALUES ('4', '\0', 'Prueba an (updated)', '169');
