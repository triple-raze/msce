//!
//! Generated from an OAS specification by openapi-model-generator(v0.6.2)
//!

use serde::{Serialize, Deserialize};

/// ApiError
#[derive(Debug, Clone, Serialize, Deserialize)]
pub struct ApiError {
    pub message: String,
}

/// Operation
#[derive(Debug, Clone, Serialize, Deserialize)]
pub struct Operation {
    pub a: f64,
    pub b: f64,
}

/// Result
#[derive(Debug, Clone, Serialize, Deserialize)]
pub struct Result {
    pub result: f64,
}