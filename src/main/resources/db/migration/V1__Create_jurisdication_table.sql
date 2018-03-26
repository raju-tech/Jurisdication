DROP TABLE IF EXISTS circle_jurisdication;

CREATE TABLE `circle_jurisdication` (
  `circle_id` bigint(20) NOT NULL,
  `circle_name` varchar(255) DEFAULT NULL,
  `zip_code` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`circle_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- https://cognizant-pal-v7.apps.cumuluslabs.io/